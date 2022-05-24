package com.casey.earmark.persistence

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.casey.earmark.model.SavingsItem

@Dao
interface SavingsDao {

    @Insert
    fun insertSavings(savingsItem: SavingsItem)

    @Query("SELECT * FROM savings")
    suspend fun fetchAllSavings(): List<SavingsItem>
}
