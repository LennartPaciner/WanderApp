package com.example.wanderapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

//für dagger hilt behind the scene java code: rebuild project
@HiltAndroidApp
class BaseApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }

}