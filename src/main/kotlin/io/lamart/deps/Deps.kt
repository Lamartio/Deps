package io.lamart.deps

import kotlin.reflect.KClass

interface Deps {

    fun <T : Any> getOrNull(key: KClass<T>): T?

    companion object

    interface Builder : Deps {

        operator fun <T : Any> set(key: KClass<T>, factory: () -> T)

        companion object

    }

}
