package io.lamart.deps

operator fun Deps.plus(deps: Deps): Deps =
    Deps(this@plus.map + deps.map)

operator fun Deps.plus(deps: Iterable<Deps>): Deps = deps.asSequence().let(::plus)

operator fun Deps.plus(deps: Sequence<Deps>): Deps =
    deps.fold(this) { previous, next -> previous + next }
