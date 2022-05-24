package com.casey.earmark.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.casey.earmark.R
import com.casey.earmark.model.DebtItem
import com.casey.earmark.viewmodel.DebtsViewModel
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import com.google.android.material.textfield.TextInputEditText

class AddDebtFragment : Fragment() {

    lateinit var cancelButton: ExtendedFloatingActionButton
    lateinit var addButton: ExtendedFloatingActionButton
    lateinit var debtName: TextInputEditText
    lateinit var balance: TextInputEditText
    lateinit var interestRate: TextInputEditText
    lateinit var monthlyPayment: TextInputEditText
    lateinit var debtType: TextInputEditText

    lateinit var viewModel: DebtsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_add_debt, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this@AddDebtFragment)[DebtsViewModel::class.java]

        cancelButton = view.findViewById(R.id.cancelButton)
        addButton = view.findViewById(R.id.addButton)
        debtName = view.findViewById(R.id.addDebtTitle)
        balance = view.findViewById(R.id.balanceAmount)
        interestRate = view.findViewById(R.id.interestRate)
        monthlyPayment = view.findViewById(R.id.monthlyPayment)
        debtType = view.findViewById(R.id.debtType)

        cancelButton.setOnClickListener { requireActivity().onBackPressed() } // nav components
        addButton.setOnClickListener {
            if (!debtName.text.isNullOrEmpty() && !balance.text.isNullOrEmpty() &&
                !interestRate.text.isNullOrEmpty() && !monthlyPayment.text.isNullOrEmpty() &&
                !debtType.text.isNullOrEmpty()
            ) {
                val newDebt = DebtItem(
                    debtTitle = debtName.text.toString(),
                    balance = balance.text.toString().toDouble(),
                    interestRate = interestRate.text.toString().toDouble(),
                    monthlyPayment = monthlyPayment.text.toString().toDouble(),
                    type = debtType.text.toString()
                )
                viewModel.createDebt(newDebt)
                requireActivity().onBackPressed()
            }
        }
    }
}
