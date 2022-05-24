package com.casey.earmark.repos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/casey/earmark/repos/DebtRespository;", "", "debtDao", "Lcom/casey/earmark/persistence/DebtDao;", "(Lcom/casey/earmark/persistence/DebtDao;)V", "getDebtDao", "()Lcom/casey/earmark/persistence/DebtDao;", "createDebt", "", "debtItem", "Lcom/casey/earmark/model/DebtItem;", "fetchDebts", "Lcom/casey/earmark/Resource;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class DebtRespository {
    @org.jetbrains.annotations.NotNull()
    private final com.casey.earmark.persistence.DebtDao debtDao = null;
    
    public DebtRespository(@org.jetbrains.annotations.NotNull()
    com.casey.earmark.persistence.DebtDao debtDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.casey.earmark.persistence.DebtDao getDebtDao() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchDebts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.casey.earmark.Resource<java.util.List<com.casey.earmark.model.DebtItem>>> continuation) {
        return null;
    }
    
    public final void createDebt(@org.jetbrains.annotations.NotNull()
    com.casey.earmark.model.DebtItem debtItem) {
    }
}