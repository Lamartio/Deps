package io.lamart.deps

import kotlin.reflect.KClass

operator fun Deps.Builder.Companion.invoke(block: Deps.Builder.() -> Unit): Deps.Builder.() -> Unit = block

internal fun depsBuilderOf(map: MutableDepsMap, parent: Deps? = null): Deps.Builder =
    object : Deps.Builder, Deps by depsOf(map, parent) {
        override fun <T : Any> set(key: KClass<T>, factory: () -> T) =
            map.set(key, factory)
    }