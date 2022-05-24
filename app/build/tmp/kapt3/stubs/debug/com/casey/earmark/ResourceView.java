package com.casey.earmark;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lcom/casey/earmark/ResourceView;", "T", "", "showData", "", "data", "(Ljava/lang/Object;)V", "showError", "error", "", "showLoading", "isLoading", "", "app_debug"})
public abstract interface ResourceView<T extends java.lang.Object> {
    
    public abstract void showData(T data);
    
    public abstract void showLoading(boolean isLoading);
    
    public abstract void showError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable error);
}