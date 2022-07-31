package com.ian_no_1.mavericdemo

import android.app.Application
import com.airbnb.mvrx.Mavericks

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Mavericks.initialize(this)
    }
}