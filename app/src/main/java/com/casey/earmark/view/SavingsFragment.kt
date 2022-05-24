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
import com.casey.earmark.model.SavingsItem
import com.casey.earmark.viewmodel.SavingsViewModel

class SavingsFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var savingsAdapter: SavingsAdapter
    lateinit var appToolbar: AppToolbar
    lateinit var submenuLayout: ConstraintLayout

    lateinit var viewModel: SavingsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_savings, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this@SavingsFragment)[SavingsViewModel::class.java].apply {
            savingsLiveData.observe(
                viewLifecycleOwner,
                ResourceViewObserver(fetchSavingsResourceView)
            )
        }

        recyclerView = view.findViewById(R.id.recyclerView)
        submenuLayout = view.findViewById(R.id.submenuLayout)
        appToolbar = view.findViewById(R.id.toolbar)
        appToolbar.setListeners {
            when (it.itemId) {
                R.id.menuAdd -> {
                    parentFragmentManager.beginTransaction()
                        .replace(R.id.container, AddSavingsFragment())
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
        viewModel.fetchSavings()
    }

    private val fetchSavingsResourceView = object : ResourceView<List<SavingsItem>> {
        override fun showData(data: List<SavingsItem>) {
            recyclerView.apply {
                savingsAdapter = SavingsAdapter(data)
                layoutManager = LinearLayoutManager(this@SavingsFragment.requireContext())
                adapter = savingsAdapter
            }
        }

        override fun showLoading(isLoading: Boolean) {
        }

        override fun showError(error: Throwable) {
            Log.w("SavingsFragment: ", "${error.message}")
            error.printStackTrace()
            Toast.makeText(requireContext(), "Error: ${error.localizedMessage}", Toast.LENGTH_SHORT)
                .show()
        }
    }
}
