package com.tmw.appInitializers

import android.app.Application
import com.tmw.appinitializers.AppInitializer
import javax.inject.Inject

/**
 * Created by ashish on 23,August,2019
 *
 */
class AppInitializers @Inject constructor(private val initializers: Set<@JvmSuppressWildcards AppInitializer>) {

    fun init(application: Application) {
        initializers.forEach {
            it.init(application)
        }
    }
}