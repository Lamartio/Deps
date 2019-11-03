package io.lamart.deps

import kotlin.reflect.KClass
import kotlin.reflect.KProperty

@Throws
infix operator fun <T : Any> Deps.get(key: KClass<T>): T =
    getOrNull(key) ?: throw NullPointerException("No value for key: $key")

inline fun <reified T : Any> Deps.get() = get(T::class)

inline operator fun <R, reified T : Any> Deps.getValue(thisRef: R, property: KProperty<*>): T = get()

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

inline infix operator fun <reified P1 : Any, R> Deps.get(factory: (P1) -> R): R =
    factory(get())

inline infix operator fun <reified P1 : Any, reified P2 : Any, R> Deps.get(factory: (P1, P2) -> R): R =
    factory(get(), get())

inline infix operator fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, R> Deps.get(factory: (P1, P2, P3) -> R): R =
    factory(get(), get(), get())

inline infix operator fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, R> Deps.get(
    factory: (P1, P2, P3, P4) -> R
): R = factory(get(), get(), get(), get())

inline infix operator fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, R> Deps.get(
    factory: (P1, P2, P3, P4, P5) -> R
): R = factory(get(), get(), get(), get(), get())

inline infix operator fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, R> Deps.get(
    factory: (P1, P2, P3, P4, P5, P6) -> R
): R = factory(get(), get(), get(), get(), get(), get())

inline infix operator fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, R> Deps.get(
    factory: (P1, P2, P3, P4, P5, P6, P7) -> R
): R = factory(get(), get(), get(), get(), get(), get(), get())

inline infix operator fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, reified P8 : Any, R> Deps.get(
    factory: (P1, P2, P3, P4, P5, P6, P7, P8) -> R
): R = factory(get(), get(), get(), get(), get(), get(), get(), get())

inline infix operator fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, reified P8 : Any, reified P9 : Any, R> Deps.get(
    factory: (P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R
): R = factory(get(), get(), get(), get(), get(), get(), get(), get(), get())

inline infix operator fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, reified P8 : Any, reified P9 : Any, reified P10 : Any, R> Deps.get(
    factory: (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R
): R = factory(get(), get(), get(), get(), get(), get(), get(), get(), get(), get())

inline infix operator fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, reified P8 : Any, reified P9 : Any, reified P10 : Any, reified P11 : Any, R> Deps.get(
    factory: (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R
): R = factory(get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get())

inline infix operator fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, reified P8 : Any, reified P9 : Any, reified P10 : Any, reified P11 : Any, reified P12 : Any, R> Deps.get(
    factory: (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R
): R = factory(get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get())
