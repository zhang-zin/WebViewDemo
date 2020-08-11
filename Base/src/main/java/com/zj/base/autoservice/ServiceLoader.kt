package com.zj.base.autoservice

import java.util.ServiceLoader

object ServiceLoader {

    fun <S> load(service: Class<S>?): S? {
        return try {
            ServiceLoader.load(service).iterator().next()
        } catch (e: Exception) {
            null
        }
    }
}