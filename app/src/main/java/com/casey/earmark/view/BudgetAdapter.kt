package com.casey.earmark.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.casey.earmark.R
import com.casey.earmark.model.BudgetItem

class BudgetAdapter(val list: List<BudgetItem>) : RecyclerView.Adapter<BudgetAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val budgetTitle: TextView = itemView.findViewById(R.id.budgetTitle)
        val budgetAmount: TextView = itemView.findViewById(R.id.budgetAmount)
        val dueDate: TextView = itemView.findViewById(R.id.budgetDueDate)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item_budget, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.apply {
            budgetTitle.text = list[position].budgetTitle
            budgetAmount.text = list[position].amount.toString()
            dueDate.text = "11/22/22"
        }
    }

    override fun getItemCount(): Int = list.size
}