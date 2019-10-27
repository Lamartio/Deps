package io.lamart.deps


inline fun <reified T : Any> Deps.Builder.singleton(value: T) = set(T::class) { value }

inline fun <reified T : Any> Deps.Builder.singleton(noinline factory: () -> T) =
    set(T::class, object : () -> T {
        val result by kotlin.lazy(factory)
        override fun invoke(): T = result
    })

inline fun <reified T : Any, reified P1 : Any> Deps.Builder.singleton(
    crossinline factory: (P1) -> T
) = singleton { -> get(factory) }

inline fun <reified T : Any, reified P1 : Any, reified P2 : Any> Deps.Builder.singleton(
    crossinline factory: (P1, P2) -> T
) = singleton { -> get(factory) }

inline fun <reified T : Any, reified P1 : Any, reified P2 : Any, reified P3 : Any> Deps.Builder.singleton(
    crossinline factory: (P1, P2, P3) -> T
) = singleton { -> get(factory) }

inline fun <reified T : Any, reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any> Deps.Builder.singleton(
    crossinline factory: (P1, P2, P3, P4) -> T
) = singleton { -> get(factory) }

inline fun <reified T : Any, reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any> Deps.Builder.singleton(
    crossinline factory: (P1, P2, P3, P4, P5) -> T
) = singleton { -> get(factory) }

inline fun <reified T : Any, reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any> Deps.Builder.singleton(
    crossinline factory: (P1, P2, P3, P4, P5, P6) -> T
) = singleton { -> get(factory) }