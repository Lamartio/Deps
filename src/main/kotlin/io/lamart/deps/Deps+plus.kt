package io.lamart.deps


operator fun Deps.plus(block: Deps.Builder.() -> Unit): Deps =
    Deps.Builder(map.toMutableMap()).apply(block).build()

operator fun Deps.plus(builders: Iterable<Deps.Builder.() -> Unit>): Deps =
    builders.asSequence().let(::plus)

operator fun Deps.plus(builders: Sequence<Deps.Builder.() -> Unit>): Deps =
    builders.fold(this) { parent, child -> parent + child }

internal operator fun Deps.plus(child: Deps): Deps =
    map.toMutableMap().plus(child.map).let(::Deps)