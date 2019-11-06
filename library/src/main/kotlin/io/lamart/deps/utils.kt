package io.lamart.deps

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

fun <R, T> readOnlyPropertyOf(get: () -> T) =
    object : ReadOnlyProperty<R, T> {
        override fun getValue(thisRef: R, property: KProperty<*>): T = get()
    }