package com.casey.earmark

import android.app.Application
import com.casey.earmark.di.AppComponent
import com.casey.earmark.di.DaggerAppComponent

class EarmarkApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().application(this).build()
    }
}