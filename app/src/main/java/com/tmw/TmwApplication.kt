package com.tmw

import com.tmw.appInitializers.AppInitializers
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import javax.inject.Inject

/**
 * Created by ashish on 23,August,2019
 */
class TmwApplication : DaggerApplication() {

//    @Inject
//    lateinit var initializers: AppInitializers

    override fun onCreate() {
        super.onCreate()
//        initializers.init(this)
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication>? {
        return null
    }

}