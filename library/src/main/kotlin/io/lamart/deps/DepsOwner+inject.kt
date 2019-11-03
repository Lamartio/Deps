package io.lamart.deps

inline fun <R, reified T : Any> DepsOwner.inject() = readOnlyPropertyOf<R, T> { deps.get() }

inline fun <R, reified T : Any, reified P1 : Any> DepsOwner.inject(
    noinline factory: (P1) -> T
) = readOnlyPropertyOf<R, T> { deps[factory] }

inline fun <R, reified T : Any, reified P1 : Any, reified P2 : Any> DepsOwner.inject(
    noinline factory: (P1, P2) -> T
) = readOnlyPropertyOf<R, T> { deps[factory] }

inline fun <R, reified T : Any, reified P1 : Any, reified P2 : Any, reified P3 : Any> DepsOwner.inject(
    noinline factory: (P1, P2, P3) -> T
) = readOnlyPropertyOf<R, T> { deps[factory] }

inline fun <R, reified T : Any, reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any> DepsOwner.inject(
    noinline factory: (P1, P2, P3, P4) -> T
) = readOnlyPropertyOf<R, T> { deps[factory] }

inline fun <R, reified T : Any, reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any> DepsOwner.inject(
    noinline factory: (P1, P2, P3, P4, P5) -> T
) = readOnlyPropertyOf<R, T> { deps[factory] }

inline fun <R, reified T : Any, reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any> DepsOwner.inject(
    noinline factory: (P1, P2, P3, P4, P5, P6) -> T
) = readOnlyPropertyOf<R, T> { deps[factory] }

inline fun <R, reified T : Any, reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any> DepsOwner.inject(
    noinline factory: (P1, P2, P3, P4, P5, P6, P7) -> T
) = readOnlyPropertyOf<R, T> { deps[factory] }

inline fun <R, reified T : Any, reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, reified P8 : Any> DepsOwner.inject(
    noinline factory: (P1, P2, P3, P4, P5, P6, P7, P8) -> T
) = readOnlyPropertyOf<R, T> { deps[factory] }

inline fun <R, reified T : Any, reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, reified P8 : Any, reified P9 : Any> DepsOwner.inject(
    noinline factory: (P1, P2, P3, P4, P5, P6, P7, P8, P9) -> T
) = readOnlyPropertyOf<R, T> { deps[factory] }

inline fun <R, reified T : Any, reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, reified P8 : Any, reified P9 : Any, reified P10 : Any> DepsOwner.inject(
    noinline factory: (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> T
) = readOnlyPropertyOf<R, T> { deps[factory] }

inline fun <R, reified T : Any, reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, reified P8 : Any, reified P9 : Any, reified P10 : Any, reified P11 : Any> DepsOwner.inject(
    noinline factory: (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> T
) = readOnlyPropertyOf<R, T> { deps[factory] }

inline fun <R, reified T : Any, reified P1 : Any, reified P2 : Any, reified P3 : Any, reified P4 : Any, reified P5 : Any, reified P6 : Any, reified P7 : Any, reified P8 : Any, reified P9 : Any, reified P10 : Any, reified P11 : Any, reified P12 : Any> DepsOwner.inject(
    noinline factory: (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> T
) = readOnlyPropertyOf<R, T> { deps[factory] }
