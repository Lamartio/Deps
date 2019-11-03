package io.lamart.deps

operator fun Deps.plus(child: Deps): Deps = let { parent ->
    when {
        parent is DepsInstance && child is DepsInstance -> DepsInstance(parent.map + child.map)
        else -> DepsWrapper(parent, child)
    }
}

operator fun Deps.plus(children: Array<Deps>): Deps = children.asSequence().let(::plus)

operator fun Deps.plus(children: Iterable<Deps>): Deps = children.asSequence().let(::plus)

operator fun Deps.plus(children: Sequence<Deps>): Deps =
    children.fold(this) { previous, next -> previous + next }
