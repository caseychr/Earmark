package com.casey.earmark.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "budget")
data class BudgetItem(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val budgetTitle: String,
    val amount: Double,
    val dueDate: String
)