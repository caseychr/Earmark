package com.casey.earmark.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020.H\u0016J\u001a\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u00061"}, d2 = {"Lcom/casey/earmark/view/DebtFragment;", "Landroidx/fragment/app/Fragment;", "()V", "appToolbar", "Lcom/casey/earmark/view/AppToolbar;", "getAppToolbar", "()Lcom/casey/earmark/view/AppToolbar;", "setAppToolbar", "(Lcom/casey/earmark/view/AppToolbar;)V", "debtAdapter", "Lcom/casey/earmark/view/DebtAdapter;", "getDebtAdapter", "()Lcom/casey/earmark/view/DebtAdapter;", "setDebtAdapter", "(Lcom/casey/earmark/view/DebtAdapter;)V", "fetchDebtsResourceView", "Lcom/casey/earmark/ResourceView;", "", "Lcom/casey/earmark/model/DebtItem;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "submenuLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getSubmenuLayout", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setSubmenuLayout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "viewModel", "Lcom/casey/earmark/viewmodel/DebtsViewModel;", "getViewModel", "()Lcom/casey/earmark/viewmodel/DebtsViewModel;", "setViewModel", "(Lcom/casey/earmark/viewmodel/DebtsViewModel;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "", "onViewCreated", "view", "app_debug"})
public final class DebtFragment extends androidx.fragment.app.Fragment {
    public androidx.recyclerview.widget.RecyclerView recyclerView;
    public com.casey.earmark.view.DebtAdapter debtAdapter;
    public com.casey.earmark.view.AppToolbar appToolbar;
    public androidx.constraintlayout.widget.ConstraintLayout submenuLayout;
    public com.casey.earmark.viewmodel.DebtsViewModel viewModel;
    private final com.casey.earmark.ResourceView<java.util.List<com.casey.earmark.model.DebtItem>> fetchDebtsResourceView = null;
    
    public DebtFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return null;
    }
    
    public final void setRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.casey.earmark.view.DebtAdapter getDebtAdapter() {
        return null;
    }
    
    public final void setDebtAdapter(@org.jetbrains.annotations.NotNull()
    com.casey.earmark.view.DebtAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.casey.earmark.view.AppToolbar getAppToolbar() {
        return null;
    }
    
    public final void setAppToolbar(@org.jetbrains.annotations.NotNull()
    com.casey.earmark.view.AppToolbar p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.constraintlayout.widget.ConstraintLayout getSubmenuLayout() {
        return null;
    }
    
    public final void setSubmenuLayout(@org.jetbrains.annotations.NotNull()
    androidx.constraintlayout.widget.ConstraintLayout p0) {
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
    
    @java.lang.Override()
    public void onResume() {
    }
}