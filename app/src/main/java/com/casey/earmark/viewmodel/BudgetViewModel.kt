package com.casey.earmark.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.casey.earmark.Resource
import com.casey.earmark.model.BudgetItem
import com.casey.earmark.persistence.EarmarkDatabase
import com.casey.earmark.repos.BudgetRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class BudgetViewModel(application: Application) : AndroidViewModel(application) {
    val repo: BudgetRepository = BudgetRepository(
        budgetDao = EarmarkDatabase.db(application.applicationContext).budgetDao()
    )

    val budgetLiveData = MutableLiveData<Resource<List<BudgetItem>>>()

    fun fetchBudget() {
        CoroutineScope(Dispatchers.Default).launch {
            budgetLiveData.postValue(repo.fetchBudget())
        }
    }

    fun createBudgetItem(budgetItem: BudgetItem) {
        CoroutineScope(Dispatchers.Default).launch {
            repo.budgetDao.createBudgetItem(budgetItem)
        }
    }
}
