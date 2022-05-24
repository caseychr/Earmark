package com.casey.earmark.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.casey.earmark.R
import com.casey.earmark.ResourceView
import com.casey.earmark.ResourceViewObserver
import com.casey.earmark.model.BudgetItem
import com.casey.earmark.viewmodel.BudgetViewModel

class BudgetFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var savingsAdapter: BudgetAdapter
    lateinit var appToolbar: AppToolbar
    lateinit var submenuLayout: ConstraintLayout

    lateinit var viewModel: BudgetViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_budget, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this@BudgetFragment)[BudgetViewModel::class.java].apply {
            budgetLiveData.observe(
                viewLifecycleOwner,
                ResourceViewObserver(fetchBudgetResourceView)
            )
        }

        recyclerView = view.findViewById(R.id.recyclerView)
        submenuLayout = view.findViewById(R.id.submenuLayout)
        appToolbar = view.findViewById(R.id.toolbar)
        appToolbar.setListeners {
            when (it.itemId) {
                R.id.menuAdd -> {
                    AddBudgetFragment().show(parentFragmentManager, null)
                }
                R.id.menuMoreOptions -> {
                    if (submenuLayout.isVisible) {
                        submenuLayout.visibility = View.GONE
                    } else {
                        submenuLayout.visibility = View.VISIBLE
                    }
                }
            }
            true
        }
    }

    override fun onResume() {
        super.onResume()
        viewModel.fetchBudget()
    }

    private val fetchBudgetResourceView = object : ResourceView<List<BudgetItem>> {
        override fun showData(data: List<BudgetItem>) {
            recyclerView.apply {
                savingsAdapter = BudgetAdapter(data)
                layoutManager = GridLayoutManager(this@BudgetFragment.requireContext(), 3)
                adapter = savingsAdapter
            }
        }

        override fun showLoading(isLoading: Boolean) {
        }

        override fun showError(error: Throwable) {
            Log.w("BudgetFragment: ", "${error.message}")
            error.printStackTrace()
            Toast.makeText(requireContext(), "Error: ${error.localizedMessage}", Toast.LENGTH_SHORT)
                .show()
        }
    }
}

fun mockList(): List<BudgetItem> {
    val newItem = BudgetItem(0, "rent", 1100.00, "11/22/22")
    val list = mutableListOf<BudgetItem>()
    list.add(newItem)
    list.add(newItem)
    list.add(newItem)
    list.add(newItem)
    list.add(newItem)
    list.add(newItem)
    return list
}
