package com.tmw.appinitializers

import android.app.Application

/**
 * Created by ashish on 24,August,2019
 */
interface AppInitializer {
    fun init(application: Application)
}