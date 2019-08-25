package com.tmw.extensions

import com.tmw.data.entities.Failure
import com.tmw.data.entities.Result
import com.tmw.data.entities.Success
import retrofit2.HttpException
import retrofit2.Response

/**
 * Created by ashish on 23,August,2019
 */

fun <T> Response<T>.bodyOrThrow(): T {
    if (!isSuccessful) {
        throw HttpException(this)
    }
    return body()!!
}


fun <T> Response<T>.isFromNetwork(): Boolean {
    return raw().cacheResponse == null
}

fun <T> Response<T>.toException() = HttpException(this)

@Suppress("REDUNDANT_INLINE_SUSPEND_FUNCTION_TYPE")
suspend fun <T, E> Response<T>.toResult(mapper: suspend (T) -> E): Result<E> {
    return try {
        if (isSuccessful) {
            Success(data = mapper(bodyOrThrow()), responseModified = isFromNetwork())
        } else {
            Failure(toException())
        }
    } catch (e: Exception) {
        Failure(e)
    }
}