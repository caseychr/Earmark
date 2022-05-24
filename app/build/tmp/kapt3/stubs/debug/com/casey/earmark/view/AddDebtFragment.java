package com.casey.earmark.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u001a\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020%2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u00a8\u0006/"}, d2 = {"Lcom/casey/earmark/view/AddDebtFragment;", "Landroidx/fragment/app/Fragment;", "()V", "addButton", "Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;", "getAddButton", "()Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;", "setAddButton", "(Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;)V", "balance", "Lcom/google/android/material/textfield/TextInputEditText;", "getBalance", "()Lcom/google/android/material/textfield/TextInputEditText;", "setBalance", "(Lcom/google/android/material/textfield/TextInputEditText;)V", "cancelButton", "getCancelButton", "setCancelButton", "debtName", "getDebtName", "setDebtName", "debtType", "getDebtType", "setDebtType", "interestRate", "getInterestRate", "setInterestRate", "monthlyPayment", "getMonthlyPayment", "setMonthlyPayment", "viewModel", "Lcom/casey/earmark/viewmodel/DebtsViewModel;", "getViewModel", "()Lcom/casey/earmark/viewmodel/DebtsViewModel;", "setViewModel", "(Lcom/casey/earmark/viewmodel/DebtsViewModel;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "app_debug"})
public final class AddDebtFragment extends androidx.fragment.app.Fragment {
    public com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton cancelButton;
    public com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton addButton;
    public com.google.android.material.textfield.TextInputEditText debtName;
    public com.google.android.material.textfield.TextInputEditText balance;
    public com.google.android.material.textfield.TextInputEditText interestRate;
    public com.google.android.material.textfield.TextInputEditText monthlyPayment;
    public com.google.android.material.textfield.TextInputEditText debtType;
    public com.casey.earmark.viewmodel.DebtsViewModel viewModel;
    
    public AddDebtFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton getCancelButton() {
        return null;
    }
    
    public final void setCancelButton(@org.jetbrains.annotations.NotNull()
    com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton getAddButton() {
        return null;
    }
    
    public final void setAddButton(@org.jetbrains.annotations.NotNull()
    com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getDebtName() {
        return null;
    }
    
    public final void setDebtName(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getBalance() {
        return null;
    }
    
    public final void setBalance(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getInterestRate() {
        return null;
    }
    
    public final void setInterestRate(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getMonthlyPayment() {
        return null;
    }
    
    public final void setMonthlyPayment(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getDebtType() {
        return null;
    }
    
    public final void setDebtType(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.casey.earmark.viewmodel.DebtsViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.casey.earmark.viewmodel.DebtsViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}