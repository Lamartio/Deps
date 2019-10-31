package io.lamart.deps

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

inline fun <R, reified T : Any> readOnlyPropertyOf(crossinline get: () -> T) =
    object : ReadOnlyProperty<R, T> {
        override fun getValue(thisRef: R, property: KProperty<*>): T = get()
    }