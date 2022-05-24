package com.casey.earmark.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.casey.earmark.R
import com.casey.earmark.model.SavingsItem
import com.casey.earmark.viewmodel.SavingsViewModel
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import com.google.android.material.textfield.TextInputEditText

class AddSavingsFragment : Fragment() {

    lateinit var cancelButton: ExtendedFloatingActionButton
    lateinit var addButton: ExtendedFloatingActionButton
    lateinit var savingsName: TextInputEditText
    lateinit var goal: TextInputEditText
    lateinit var monthlyPayment: TextInputEditText

    lateinit var viewModel: SavingsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_add_savings, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this@AddSavingsFragment)[SavingsViewModel::class.java]

        cancelButton = view.findViewById(R.id.cancelButton)
        addButton = view.findViewById(R.id.addButton)
        savingsName = view.findViewById(R.id.addSavingsTitle)
        goal = view.findViewById(R.id.goalAmount)
        monthlyPayment = view.findViewById(R.id.monthlyPayment)

        cancelButton.setOnClickListener {
            requireActivity().onBackPressed() } // nav components
        addButton.setOnClickListener {
            if (!savingsName.text.isNullOrEmpty() && !goal.text.isNullOrEmpty()
                && !monthlyPayment.text.isNullOrEmpty()) {
                val newSavings = SavingsItem(
                    savingsTitle = savingsName.text.toString(),
                    goal = goal.text.toString().toDouble(),
                    monthlyPayment = monthlyPayment.text.toString().toDouble(),
                    currentBalance = 0.0
                )
                viewModel.createSavingsItem(newSavings)
                requireActivity().onBackPressed()
            }
        }
    }
}