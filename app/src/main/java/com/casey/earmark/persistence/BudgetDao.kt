package com.casey.earmark.persistence

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.casey.earmark.model.BudgetItem

@Dao
interface BudgetDao {

    @Query("SELECT * FROM budget")
    fun fetchAllBudget(): List<BudgetItem>

    @Insert
    fun createBudgetItem(budgetItem: BudgetItem)
}
