package io.lamart.deps

import kotlin.reflect.KClass

open class Deps internal constructor(internal open val map: DepsMap = mapOf()) {

    fun <T : Any> getOrNull(key: KClass<T>): T? = map.getOrNull(key)

    companion object {

        operator fun invoke(initializer: DepsBuilder.() -> Unit): Deps = DepsBuilder(initializer)

    }

}
