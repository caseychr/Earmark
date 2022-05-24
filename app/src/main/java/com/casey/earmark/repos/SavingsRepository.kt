package com.casey.earmark.repos

import com.casey.earmark.Resource
import com.casey.earmark.model.SavingsItem
import com.casey.earmark.persistence.SavingsDao

class SavingsRepository(val savingsDao: SavingsDao) {

    suspend fun fetchSavings(): Resource<List<SavingsItem>> {
        return Resource.Success(savingsDao.fetchAllSavings())
    }

    fun createSavingsItem(savingsItem: SavingsItem) = savingsDao.insertSavings(savingsItem)
}
