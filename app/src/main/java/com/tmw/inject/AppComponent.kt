package com.tmw.inject

import com.tmw.TmwApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by ashish on 25,August,2019
 * Any class with the annotation @Component defines the connection between the modules
 * and the classes which need the dependency.
 */
@Singleton
@Component(modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class
    ])
interface AppComponent : AndroidInjector<TmwApplication> {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: TmwApplication): AppComponent
    }

}