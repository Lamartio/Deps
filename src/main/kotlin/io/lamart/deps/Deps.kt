package io.lamart.deps

import kotlin.reflect.KClass

interface Deps {

    fun <T : Any> getOrNull(key: KClass<T>): T?

    companion object {

        operator fun invoke(initializer: DepsBuilder.() -> Unit): Deps = DepsBuilder(initializer)

    }

}
