package com.wahidabd.jikanclientv4.di

import com.wahidabd.jikanclientv4.BuildConfig
import com.wahidabd.library.data.libs.OkHttpClientFactory
import com.wahidabd.library.data.libs.interceptor.HeaderInterceptor
import com.wahidabd.library.data.libs.interceptor.ParameterInterceptor
import okhttp3.Interceptor
import org.koin.core.qualifier.named
import org.koin.dsl.module


/**
 * Created by Wahid on 3/26/2023.
 * Github wahidabd.
 */

const val BASE_URL = "base_url"

val apiModule = module {
    single {
        return@single OkHttpClientFactory.create(
            interceptors = listOf(getHeaderInterceptor()),
            showDebugLog = BuildConfig.DEBUG,
            certificatePinner = null,
            authenticator = null
        )
    }

    single(named(BASE_URL)){
        BuildConfig.BASE_URL
    }
}
private fun getParameterInterceptor(): Interceptor {
    val params = HashMap<String, String>()
    return ParameterInterceptor(params)
}

private fun getHeaderInterceptor(): Interceptor {
    val headers = HashMap<String, String>()
    headers["Content-Type"] = "application/json"

    return HeaderInterceptor(headers)
}
