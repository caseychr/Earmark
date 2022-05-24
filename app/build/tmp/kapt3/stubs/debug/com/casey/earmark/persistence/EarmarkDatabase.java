package com.casey.earmark.persistence;

import java.lang.System;

@androidx.room.Database(entities = {com.casey.earmark.model.DebtItem.class, com.casey.earmark.model.SavingsItem.class}, version = 1)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/casey/earmark/persistence/EarmarkDatabase;", "Landroidx/room/RoomDatabase;", "()V", "budgetDao", "Lcom/casey/earmark/persistence/BudgetDao;", "debtDao", "Lcom/casey/earmark/persistence/DebtDao;", "savingsDao", "Lcom/casey/earmark/persistence/SavingsDao;", "Companion", "app_debug"})
public abstract class EarmarkDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.casey.earmark.persistence.EarmarkDatabase.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATABASE_NAME = "earmark_db";
    
    public EarmarkDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.casey.earmark.persistence.DebtDao debtDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.casey.earmark.persistence.SavingsDao savingsDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.casey.earmark.persistence.BudgetDao budgetDao();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/casey/earmark/persistence/EarmarkDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "db", "Lcom/casey/earmark/persistence/EarmarkDatabase;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.casey.earmark.persistence.EarmarkDatabase db(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}