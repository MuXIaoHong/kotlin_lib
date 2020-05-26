package com.muxiaohong.kotlinlib.network.interceptor

import okhttp3.Interceptor
import okhttp3.Response

/**
 *author：93289
 *date:2020/5/25
 *dsc:
 */
class NetCacheInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val response = chain.proceed(request)
        return response.newBuilder()
            .removeHeader("pragma")
            .header("Cache-Control", "max-age=600")
            .build()
    }
}