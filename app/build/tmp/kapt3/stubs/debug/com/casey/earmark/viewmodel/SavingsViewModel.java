package com.casey.earmark.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rJ\u0006\u0010\u0013\u001a\u00020\u0011R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR#\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0014"}, d2 = {"Lcom/casey/earmark/viewmodel/SavingsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "repo", "Lcom/casey/earmark/repos/SavingsRepository;", "getRepo", "()Lcom/casey/earmark/repos/SavingsRepository;", "savingsLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/casey/earmark/Resource;", "", "Lcom/casey/earmark/model/SavingsItem;", "getSavingsLiveData", "()Landroidx/lifecycle/MutableLiveData;", "createSavingsItem", "", "savingsItem", "fetchSavings", "app_debug"})
public final class SavingsViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.casey.earmark.repos.SavingsRepository repo = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.casey.earmark.Resource<java.util.List<com.casey.earmark.model.SavingsItem>>> savingsLiveData = null;
    
    public SavingsViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.casey.earmark.repos.SavingsRepository getRepo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.casey.earmark.Resource<java.util.List<com.casey.earmark.model.SavingsItem>>> getSavingsLiveData() {
        return null;
    }
    
    public final void fetchSavings() {
    }
    
    public final void createSavingsItem(@org.jetbrains.annotations.NotNull()
    com.casey.earmark.model.SavingsItem savingsItem) {
    }
}