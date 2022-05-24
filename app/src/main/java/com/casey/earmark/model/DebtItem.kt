package com.casey.earmark.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "debts")
data class DebtItem(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val debtTitle: String,
    val balance: Double,
    val interestRate: Double,
    val monthlyPayment: Double,
    val type: String
)

/*
data class DebtItem(
    val debtTitle: String,
    val debtMonths: Int,
    val payoffDate: String,
    val principal: Double,
    val interest: Double,
    val compounding: String
)*/
