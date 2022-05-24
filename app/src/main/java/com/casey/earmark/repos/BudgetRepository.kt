package com.casey.earmark.repos

import com.casey.earmark.Resource
import com.casey.earmark.model.BudgetItem
import com.casey.earmark.persistence.BudgetDao

class BudgetRepository(val budgetDao: BudgetDao) {

    suspend fun fetchBudget(): Resource<List<BudgetItem>> {
        return Resource.Success(budgetDao.fetchAllBudget())
    }

    fun createBudget(budgetItem: BudgetItem) {
        budgetDao.createBudgetItem(budgetItem)
    }
}