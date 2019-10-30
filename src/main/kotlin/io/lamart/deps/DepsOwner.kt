package io.lamart.deps

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

interface DepsOwner {
    val deps: Deps
}

inline fun <reified T : Any> DepsOwner.get(): ReadOnlyProperty<DepsOwner, T> =
    object : ReadOnlyProperty<DepsOwner, T> {
        override fun getValue(thisRef: DepsOwner, property: KProperty<*>): T = deps.get()
    }