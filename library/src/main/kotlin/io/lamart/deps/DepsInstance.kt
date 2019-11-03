package io.lamart.deps

import kotlin.reflect.KClass

internal open class DepsInstance(internal open val map: DepsMap = mapOf()) : Deps {

    override fun <T : Any> getOrNull(key: KClass<T>): T? = map.getOrNull(key)

}