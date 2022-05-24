package com.casey.earmark.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.casey.Earmark.ProgressAmountView
import com.casey.earmark.R
import com.casey.earmark.model.DebtItem

class DebtAdapter(val list: List<DebtItem>) :
    RecyclerView.Adapter<DebtAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val debtTitle: TextView = itemView.findViewById(R.id.debtTitle)
        val debtMonths: TextView = itemView.findViewById(R.id.debtMonths)
        val payoffDate: TextView = itemView.findViewById(R.id.payoffDate)
        val principal: TextView = itemView.findViewById(R.id.principalAmount)
        val interest: TextView = itemView.findViewById(R.id.interestAmount)
        val compounding: TextView = itemView.findViewById(R.id.compound)
        val progressBar: ProgressAmountView = itemView.findViewById(R.id.progressAmountView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.list_item_debt, parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.apply {
            debtTitle.text = list[position].debtTitle
            //debtMonths.text = "Months: ${list[position].debtMonths}"
            //payoffDate.text = "Payoff Date: ${list[position].payoffDate}"
            principal.text = "Principal: $${list[position].balance}"
            interest.text = "Interest: $${list[position].interestRate}"
            compounding.text = "Compounding? ${list[position].type}"
            progressBar.setTotalAmount("$5000")
            progressBar.setInterestAmount("3%")
            progressBar.setCurrentAmount("$100")
        }
    }

    override fun getItemCount(): Int = list.size
}
