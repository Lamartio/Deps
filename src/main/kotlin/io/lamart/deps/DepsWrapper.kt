package io.lamart.deps

import kotlin.reflect.KClass

class DepsWrapper(private val parent: Deps, private val child: Deps) : Deps {

    override fun <T : Any> getOrNull(key: KClass<T>): T? =
        child.getOrNull(key) ?: parent.getOrNull(key)

}