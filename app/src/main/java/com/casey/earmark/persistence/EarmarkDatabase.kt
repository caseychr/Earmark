package com.casey.earmark.persistence

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.casey.earmark.model.DebtItem
import com.casey.earmark.model.SavingsItem

@Database(entities = [DebtItem::class, SavingsItem::class], version = 1)
abstract class EarmarkDatabase : RoomDatabase() {
    abstract fun debtDao(): DebtDao
    abstract fun savingsDao(): SavingsDao
    abstract fun budgetDao(): BudgetDao

    companion object {
        const val DATABASE_NAME = "earmark_db"

        fun db(context: Context): EarmarkDatabase {
            return Room.databaseBuilder(
                context, EarmarkDatabase::class.java, DATABASE_NAME
            )
                .build()
        }
    }
}
