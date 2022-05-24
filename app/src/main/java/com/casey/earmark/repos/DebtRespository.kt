package com.casey.earmark.repos

import com.casey.earmark.Resource
import com.casey.earmark.model.DebtItem
import com.casey.earmark.persistence.DebtDao

class DebtRespository(val debtDao: DebtDao) {

    suspend fun fetchDebts(): Resource<List<DebtItem>> {
        return Resource.Success(debtDao.fetchAllDebts())
    }

    fun createDebt(debtItem: DebtItem) = debtDao.insertDebts(debtItem)
}
