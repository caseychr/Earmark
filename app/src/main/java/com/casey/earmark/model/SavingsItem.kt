package com.casey.earmark.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "savings")
data class SavingsItem(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val savingsTitle: String,
    val currentBalance: Double,
    val monthlyPayment: Double,
    val goal: Double
)