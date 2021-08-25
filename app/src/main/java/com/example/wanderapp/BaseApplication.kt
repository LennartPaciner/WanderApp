package com.example.wanderapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

//für dagger hilt behind the scene java code: rebuild project
@HiltAndroidApp
class BaseApplication: Application() {


}