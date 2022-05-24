package com.casey.earmark.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.ViewModelProvider
import com.casey.earmark.R
import com.casey.earmark.model.BudgetItem
import com.casey.earmark.viewmodel.BudgetViewModel
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import com.google.android.material.textfield.TextInputEditText

class AddBudgetFragment : DialogFragment() {

    lateinit var addButton: Button
    lateinit var budgetTitle: TextInputEditText
    lateinit var budgetAmount: TextInputEditText
    lateinit var dueDate: TextInputEditText

    lateinit var viewModel: BudgetViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_add_budget_dialog, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this@AddBudgetFragment)[BudgetViewModel::class.java]

        addButton = view.findViewById(R.id.addButton)
        budgetTitle = view.findViewById(R.id.addBudgetTitle)
        budgetAmount = view.findViewById(R.id.addBudgetAmount)
        dueDate = view.findViewById(R.id.budgetDueDate)

        addButton.setOnClickListener {
            if (!budgetTitle.text.isNullOrEmpty() &&
                !budgetAmount.text.isNullOrEmpty() &&
                !dueDate.text.isNullOrEmpty()
            ) {
                val newBudgetItem = BudgetItem(
                    null,
                    budgetTitle.text.toString(),
                    budgetAmount.text.toString().toDouble(),
                    dueDate.text.toString()
                )
                viewModel.createBudgetItem(newBudgetItem)
                dismiss()
            }
        }
    }
}
