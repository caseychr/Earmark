package com.casey.earmark.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.casey.Earmark.ProgressAmountView
import com.casey.earmark.R
import com.casey.earmark.model.SavingsItem

class SavingsAdapter(val list: List<SavingsItem>) : RecyclerView.Adapter<SavingsAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val savingsTitle: TextView = itemView.findViewById(R.id.savingTitle)
        val savingsExpectedDate: TextView = itemView.findViewById(R.id.savingsExpectedDate)
        val progressBar: ProgressAmountView = itemView.findViewById(R.id.progressAmountView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item_savings, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.apply {
            savingsTitle.text = list[position].savingsTitle
            //savingsExpectedDate.text = list[position]
            progressBar.setTotalAmount("$5000")
            progressBar.setInterestAmount("3%")
            progressBar.setCurrentAmount("$100")
        }
    }

    override fun getItemCount(): Int = list.size
}