package com.casey.earmark.persistence

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.casey.earmark.model.DebtItem

@Dao
interface DebtDao {

    @Insert
    fun insertDebts(debtItem: DebtItem)

    @Query("SELECT * FROM debts")
    suspend fun fetchAllDebts(): List<DebtItem>
}
