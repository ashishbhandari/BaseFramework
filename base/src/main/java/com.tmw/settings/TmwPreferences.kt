package com.tmw.settings

interface TmwPreferences {

    fun setup()

    val themePreference: Theme

    enum class Theme {
        LIGHT,
        DARK,
        BATTERY_SAVER_ONLY,
        SYSTEM
    }
}