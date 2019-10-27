package io.lamart.deps

inline fun <reified T : Any> Deps.Builder.factory(
    noinline factory: () -> T
) = set(T::class, factory)

inline fun <reified T : Any, reified P1 : Any> Deps.Builder.factory(
    noinline factory: (P1) -> T
) = set(T::class) { get(factory) }

inline fun <reified T : Any, reified P1 : Any, reified P2 : Any> Deps.Builder.factory(
    noinline factory: (P1, P2) -> T
) = set(T::class) { get(factory) }

inline fun <reified T : Any, reified P1 : Any, reified P2 : Any, reified P3 : Any> Deps.Builder.factory(
    noinline factory: (P1, P2, P3) -> T
) = set(T::class) { get(factory) }

inline fun <reified T : Any, reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any> Deps.Builder.factory(
    noinline factory: (P1, P2, P3, P4) -> T
) = set(T::class) { get(factory) }

inline fun <reified T : Any, reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any> Deps.Builder.factory(
    noinline factory: (P1, P2, P3, P4, P5) -> T
) = set(T::class) { get(factory) }

inline fun <reified T : Any, reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any> Deps.Builder.factory(
    noinline factory: (P1, P2, P3, P4, P5, P6) -> T
) = set(T::class) { get(factory) }