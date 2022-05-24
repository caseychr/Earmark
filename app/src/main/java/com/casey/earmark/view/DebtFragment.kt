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
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.casey.earmark.R
import com.casey.earmark.ResourceView
import com.casey.earmark.ResourceViewObserver
import com.casey.earmark.model.DebtItem
import com.casey.earmark.viewmodel.DebtsViewModel

class DebtFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var debtAdapter: DebtAdapter
    lateinit var appToolbar: AppToolbar
    lateinit var submenuLayout: ConstraintLayout

    lateinit var viewModel: DebtsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_debt, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this@DebtFragment)[DebtsViewModel::class.java].apply {
            debtsLiveData.observe(viewLifecycleOwner, ResourceViewObserver(fetchDebtsResourceView))
        }

        recyclerView = view.findViewById(R.id.recyclerView)
        submenuLayout = view.findViewById(R.id.submenuLayout)
        appToolbar = view.findViewById(R.id.toolbar)
        appToolbar.setListeners {
            when (it.itemId) {
                R.id.menuAdd -> {
                    parentFragmentManager.beginTransaction()
                        .replace(R.id.container, AddDebtFragment())
                        .addToBackStack(javaClass.simpleName).commit()
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
        viewModel.fetchDebts()
    }

    private val fetchDebtsResourceView = object : ResourceView<List<DebtItem>> {
        override fun showData(data: List<DebtItem>) {
            recyclerView.apply {
                debtAdapter = DebtAdapter(data)
                layoutManager = LinearLayoutManager(this@DebtFragment.requireContext())
                adapter = debtAdapter
            }
        }

        override fun showLoading(isLoading: Boolean) {
        }

        override fun showError(error: Throwable) {
            Log.w("DebtFragment: ", "${error.message}")
            error.printStackTrace()
            Toast.makeText(requireContext(), "Error: ${error.localizedMessage}", Toast.LENGTH_SHORT).show()
        }
    }
}
