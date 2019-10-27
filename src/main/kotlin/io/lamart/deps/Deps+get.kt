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
inline operator fun <reified T : Any> Deps.component7(): T = get()
inline operator fun <reified T : Any> Deps.component8(): T = get()
inline operator fun <reified T : Any> Deps.component9(): T = get()
inline operator fun <reified T : Any> Deps.component10(): T = get()
inline operator fun <reified T : Any> Deps.component11(): T = get()
inline operator fun <reified T : Any> Deps.component12(): T = get()

inline fun <reified T : Any> Deps.asLazy(): Lazy<T> = lazy(::get)
inline fun <reified T : Any> Deps.asLazy(mode: LazyThreadSafetyMode): Lazy<T> = lazy(mode, ::get)
inline fun <reified T : Any> Deps.asLazy(lock: Any?): Lazy<T> = lazy(lock, ::get)

inline fun <reified T : Any> Deps.asProperty() =
    object : ReadOnlyProperty<Any, T> {
        override fun getValue(thisRef: Any, property: KProperty<*>): T = get()
    }

inline infix fun <reified P1 : Any, R> Deps.get(block: (P1) -> R): R =
    block(get())

inline infix fun <reified P1 : Any, reified P2 : Any, R> Deps.get(block: (P1, P2) -> R): R =
    block(get(), get())

inline infix fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, R> Deps.get(block: (P1, P2, P3) -> R): R =
    block(get(), get(), get())

inline infix fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, R> Deps.get(
    block: (P1, P2, P3, P4) -> R
): R = block(get(), get(), get(), get())

inline infix fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, R> Deps.get(
    block: (P1, P2, P3, P4, P5) -> R
): R = block(get(), get(), get(), get(), get())

inline infix fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, R> Deps.get(
    block: (P1, P2, P3, P4, P5, P6) -> R
): R = block(get(), get(), get(), get(), get(), get())

inline infix fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, R> Deps.get(
    block: (P1, P2, P3, P4, P5, P6, P7) -> R
): R = block(get(), get(), get(), get(), get(), get(), get())

inline infix fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, reified P8 : Any, R> Deps.get(
    block: (P1, P2, P3, P4, P5, P6, P7, P8) -> R
): R = block(get(), get(), get(), get(), get(), get(), get(), get())

inline infix fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, reified P8 : Any, reified P9 : Any, R> Deps.get(
    block: (P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R
): R = block(get(), get(), get(), get(), get(), get(), get(), get(), get())

inline infix fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, reified P8 : Any, reified P9 : Any, reified P10 : Any, R> Deps.get(
    block: (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R
): R = block(get(), get(), get(), get(), get(), get(), get(), get(), get(), get())

inline infix fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, reified P8 : Any, reified P9 : Any, reified P10 : Any, reified P11 : Any, R> Deps.get(
    block: (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R
): R = block(get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get())

inline infix fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, reified P8 : Any, reified P9 : Any, reified P10 : Any, reified P11 : Any, reified P12 : Any, R> Deps.get(
    block: (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R
): R = block(get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get())
