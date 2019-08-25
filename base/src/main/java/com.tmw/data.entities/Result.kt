package com.tmw.data.entities

/**
 * Created by ashish on 23,August,2019
 */
sealed class Result<T> {
    open fun get(): T? = null
}

data class Success<T>(val data: T, val responseModified: Boolean = true) : Result<T>() {
    override fun get(): T {
        return data
    }
}

data class Failure<T>(val exception: Exception? = null, val message: String? = null) : Result<T>()

