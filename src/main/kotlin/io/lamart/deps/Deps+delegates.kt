package io.lamart.deps

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

inline fun <reified T : Any> Deps.asLazy(): Lazy<T> = lazy(::get)
inline fun <reified T : Any> Deps.asLazy(mode: LazyThreadSafetyMode): Lazy<T> = lazy(mode, ::get)
inline fun <reified T : Any> Deps.asLazy(lock: Any?): Lazy<T> = lazy(lock, ::get)

inline fun <reified T : Any> Deps.asProperty() =
    object : ReadOnlyProperty<Any, T> {
        override fun getValue(thisRef: Any, property: KProperty<*>): T = get()
    }
