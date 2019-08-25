package com.tmw.inject

import android.content.Context
import com.tmw.TmwApplication
import dagger.Module
import dagger.Provides

/**
 * Created by ashish on 25,August,2019
 */

@Module(includes = [AppModuleBinds::class])
class AppModule {

    @Provides
    fun provideContext(application: TmwApplication): Context = application.applicationContext
}