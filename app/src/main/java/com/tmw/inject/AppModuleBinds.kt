package com.tmw.inject

import android.app.Application
import com.tmw.TmwApplication
import dagger.Binds
import dagger.Module

/**
 * Created by ashish on 25,August,2019
 */
@Module
abstract class AppModuleBinds {

    @Binds
    abstract fun provideApplication(bind: TmwApplication): Application
}