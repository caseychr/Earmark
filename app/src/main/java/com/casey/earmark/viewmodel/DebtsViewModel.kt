package com.casey.earmark.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.casey.earmark.Resource
import com.casey.earmark.model.DebtItem
import com.casey.earmark.persistence.EarmarkDatabase
import com.casey.earmark.repos.DebtRespository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DebtsViewModel(application: Application) : AndroidViewModel(application) {
    val repo: DebtRespository =
        DebtRespository(debtDao = EarmarkDatabase.db(application.applicationContext).debtDao())

    val debtsLiveData = MutableLiveData<Resource<List<DebtItem>>>()

    fun fetchDebts() {
        CoroutineScope(Dispatchers.Default).launch {
            debtsLiveData.postValue(repo.fetchDebts())
        }
    }

    fun createDebt(debtItem: DebtItem) {
        CoroutineScope(Dispatchers.Default).launch {
            repo.createDebt(debtItem)
        }
    }
}
