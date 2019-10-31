package io.lamart.deps

inline fun <R, reified T : Any> Deps.inject() = readOnlyPropertyOf<R, T>(::get)

inline fun <R, reified T : Any, reified P1 : Any> Deps.inject(
    crossinline factory: (P1) -> T
) = readOnlyPropertyOf<R, T> { get(factory) }

inline fun <R, reified T : Any, reified P1 : Any, reified P2 : Any> Deps.inject(
    crossinline factory: (P1, P2) -> T
) = readOnlyPropertyOf<R, T> { get(factory) }

inline fun <R, reified T : Any, reified P1 : Any, reified P2 : Any, reified P3 : Any> Deps.inject(
    crossinline factory: (P1, P2, P3) -> T
) = readOnlyPropertyOf<R, T> { get(factory) }

inline fun <R, reified T : Any, reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any> Deps.inject(
    crossinline factory: (P1, P2, P3, P4) -> T
) = readOnlyPropertyOf<R, T> { get(factory) }

inline fun <R, reified T : Any, reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any> Deps.inject(
    crossinline factory: (P1, P2, P3, P4, P5) -> T
) = readOnlyPropertyOf<R, T> { get(factory) }

inline fun <R, reified T : Any, reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any> Deps.inject(
    crossinline factory: (P1, P2, P3, P4, P5, P6) -> T
) = readOnlyPropertyOf<R, T> { get(factory) }

inline fun <R, reified T : Any, reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any> Deps.inject(
    crossinline factory: (P1, P2, P3, P4, P5, P6, P7) -> T
) = readOnlyPropertyOf<R, T> { get(factory) }

inline fun <R, reified T : Any, reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, reified P8 : Any> Deps.inject(
    crossinline factory: (P1, P2, P3, P4, P5, P6, P7, P8) -> T
) = readOnlyPropertyOf<R, T> { get(factory) }

inline fun <R, reified T : Any, reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, reified P8 : Any, reified P9 : Any> Deps.inject(
    crossinline factory: (P1, P2, P3, P4, P5, P6, P7, P8, P9) -> T
) = readOnlyPropertyOf<R, T> { get(factory) }

inline fun <R, reified T : Any, reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, reified P8 : Any, reified P9 : Any, reified P10 : Any> Deps.inject(
    crossinline factory: (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> T
) = readOnlyPropertyOf<R, T> { get(factory) }

inline fun <R, reified T : Any, reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, reified P8 : Any, reified P9 : Any, reified P10 : Any, reified P11 : Any> Deps.inject(
    crossinline factory: (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> T
) = readOnlyPropertyOf<R, T> { get(factory) }

inline fun <R, reified T : Any, reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, reified P8 : Any, reified P9 : Any, reified P10 : Any, reified P11 : Any, reified P12 : Any> Deps.inject(
    crossinline factory: (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> T
) = readOnlyPropertyOf<R, T> { get(factory) }
