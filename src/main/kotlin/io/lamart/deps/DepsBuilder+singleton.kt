package io.lamart.deps

inline fun <reified R : Any> DepsBuilder.singleton(value: R) = set(R::class) { value }

inline fun <reified R : Any> DepsBuilder.singleton(noinline factory: () -> R) =
    set(R::class, object : () -> R {
        val result by lazy(factory)
        override fun invoke(): R = result
    })

inline fun <reified P1 : Any, reified R : Any> DepsBuilder.singleton(
    crossinline factory: (P1) -> R
) = singleton { -> get(factory) }

inline fun <reified P1 : Any, reified P2 : Any, reified R : Any> DepsBuilder.singleton(
    crossinline factory: (P1, P2) -> R
) = singleton { -> get(factory) }

inline fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified R : Any> DepsBuilder.singleton(
    crossinline factory: (P1, P2, P3) -> R
) = singleton { -> get(factory) }

inline fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified R : Any> DepsBuilder.singleton(
    crossinline factory: (P1, P2, P3, P4) -> R
) = singleton { -> get(factory) }

inline fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified R : Any> DepsBuilder.singleton(
    crossinline factory: (P1, P2, P3, P4, P5) -> R
) = singleton { -> get(factory) }

inline fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified R : Any> DepsBuilder.singleton(
    crossinline factory: (P1, P2, P3, P4, P5, P6) -> R
) = singleton { -> get(factory) }

inline fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, reified R : Any> DepsBuilder.singleton(
    noinline factory: (P1, P2, P3, P4, P5, P6, P7) -> R
) = singleton { -> get(factory) }

inline fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, reified P8 : Any, reified R : Any> DepsBuilder.singleton(
    noinline factory: (P1, P2, P3, P4, P5, P6, P7, P8) -> R
) = singleton { -> get(factory) }

inline fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, reified P8 : Any, reified P9 : Any, reified R : Any> DepsBuilder.singleton(
    noinline factory: (P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R
) = singleton { -> get(factory) }

inline fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, reified P8 : Any, reified P9 : Any, reified P10 : Any, reified R : Any> DepsBuilder.singleton(
    noinline factory: (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R
) = singleton { -> get(factory) }

inline fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, reified P8 : Any, reified P9 : Any, reified P10 : Any, reified P11 : Any, reified R : Any> DepsBuilder.singleton(
    noinline factory: (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R
) = singleton { -> get(factory) }

inline fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, reified P8 : Any, reified P9 : Any, reified P10 : Any, reified P11 : Any, reified P12 : Any, reified R : Any> DepsBuilder.singleton(
    noinline factory: (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R
) = singleton { -> get(factory) }