package io.lamart.deps

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KClass
import kotlin.reflect.KProperty

infix operator fun <T : Any> Deps.get(key: KClass<T>): T =
    getOrNull(key) ?: throw NullPointerException("No value for key: $key")

inline fun <reified T : Any> Deps.get() = get(T::class)

inline operator fun <reified T : Any> Deps.component1(): T = get()
inline operator fun <reified T : Any> Deps.component2(): T = get()
inline operator fun <reified T : Any> Deps.component3(): T = get()
inline operator fun <reified T : Any> Deps.component4(): T = get()
inline operator fun <reified T : Any> Deps.component5(): T = get()
inline operator fun <reified T : Any> Deps.component6(): T = get()

inline fun <reified T : Any> Deps.asLazy() = lazy(initializer = { get<T>() })
inline fun <reified T : Any> Deps.asLazy(mode: LazyThreadSafetyMode) = lazy(mode) { get<T>() }
inline fun <reified T : Any> Deps.asLazy(lock: Any?) = lazy(lock) { get<T>() }

inline fun <reified T : Any> Deps.asProperty() =
    object : ReadOnlyProperty<Any, T> {
        override fun getValue(thisRef: Any, property: KProperty<*>): T = get()
    }

inline infix fun <reified P1 : Any, R> Deps.get(block: (P1) -> R): R =
    block(this@get.get())

inline infix fun <reified P1 : Any, reified P2 : Any, R> Deps.get(block: (P1, P2) -> R): R =
    block(this@get.get(), this@get.get())

inline infix fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, R> Deps.get(block: (P1, P2, P3) -> R): R =
    block(this@get.get(), this@get.get(), this@get.get())

inline infix fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, R> Deps.get(
    block: (P1, P2, P3, P4) -> R
): R = block(this@get.get(), this@get.get(), this@get.get(), this@get.get())

inline infix fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, R> Deps.get(
    block: (P1, P2, P3, P4, P5) -> R
): R = block(this@get.get(), this@get.get(), this@get.get(), this@get.get(), this@get.get())

inline infix fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, R> Deps.get(
    block: (P1, P2, P3, P4, P5, P6) -> R
): R = block(
    this@get.get(),
    this@get.get(),
    this@get.get(),
    this@get.get(),
    this@get.get(),
    this@get.get()
)