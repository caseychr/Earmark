package com.casey.earmark.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.casey.earmark.Resource
import com.casey.earmark.model.SavingsItem
import com.casey.earmark.persistence.EarmarkDatabase
import com.casey.earmark.repos.SavingsRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SavingsViewModel(application: Application) : AndroidViewModel(application) {
    val repo: SavingsRepository = SavingsRepository(
        savingsDao = EarmarkDatabase.db(application.applicationContext).savingsDao()
    )

    val savingsLiveData = MutableLiveData<Resource<List<SavingsItem>>>()

    fun fetchSavings() {
        CoroutineScope(Dispatchers.Default).launch {
            savingsLiveData.postValue(repo.fetchSavings())
        }
    }

    fun createSavingsItem(savingsItem: SavingsItem) {
        CoroutineScope(Dispatchers.Default).launch {
            repo.createSavingsItem(savingsItem)
        }
    }
}
