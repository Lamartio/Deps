package io.lamart.deps

inline fun <reified R : Any> Deps.Builder.factory(
    noinline factory: () -> R
) = set(R::class, factory)

inline fun <reified P1 : Any, reified R : Any> Deps.Builder.factory(
    noinline factory: (P1) -> R
) = set(R::class) { get(factory) }

inline fun <reified P1 : Any, reified P2 : Any, reified R : Any> Deps.Builder.factory(
    noinline factory: (P1, P2) -> R
) = set(R::class) { get(factory) }

inline fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified R : Any> Deps.Builder.factory(
    noinline factory: (P1, P2, P3) -> R
) = set(R::class) { get(factory) }

inline fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified R : Any> Deps.Builder.factory(
    noinline factory: (P1, P2, P3, P4) -> R
) = set(R::class) { get(factory) }

inline fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified R : Any> Deps.Builder.factory(
    noinline factory: (P1, P2, P3, P4, P5) -> R
) = set(R::class) { get(factory) }

inline fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified R : Any> Deps.Builder.factory(
    noinline factory: (P1, P2, P3, P4, P5, P6) -> R
) = set(R::class) { get(factory) }

inline fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, reified R : Any> Deps.Builder.factory(
    noinline factory: (P1, P2, P3, P4, P5, P6, P7) -> R
) = set(R::class) { get(factory) }

inline fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, reified P8 : Any, reified R : Any> Deps.Builder.factory(
    noinline factory: (P1, P2, P3, P4, P5, P6, P7, P8) -> R
) = set(R::class) { get(factory) }

inline fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, reified P8 : Any, reified P9 : Any, reified R : Any> Deps.Builder.factory(
    noinline factory: (P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R
) = set(R::class) { get(factory) }

inline fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, reified P8 : Any, reified P9 : Any, reified P10 : Any, reified R : Any> Deps.Builder.factory(
    noinline factory: (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R
) = set(R::class) { get(factory) }

inline fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, reified P8 : Any, reified P9 : Any, reified P10 : Any, reified P11 : Any, reified R : Any> Deps.Builder.factory(
    noinline factory: (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R
) = set(R::class) { get(factory) }

inline fun <reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, reified P8 : Any, reified P9 : Any, reified P10 : Any, reified P11 : Any, reified P12 : Any, reified R : Any> Deps.Builder.factory(
    noinline factory: (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R
) = set(R::class) { get(factory) }
