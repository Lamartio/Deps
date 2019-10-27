package io.lamart.deps

import kotlin.reflect.KClass

operator fun Deps.Companion.invoke(block: Deps.Builder.() -> Unit): Deps =
    DepsBuildable().apply(block).build()

operator fun Deps.plus(builders: Iterable<Deps.Builder.() -> Unit>): Deps =
    builders.asSequence().let(::plus)

operator fun Deps.plus(builders: Sequence<Deps.Builder.() -> Unit>): Deps =
    builders.toList().fold(this) { parent, child -> parent + child }

operator fun Deps.plus(block: Deps.Builder.() -> Unit): Deps =
    DepsBuildable(parent = this@plus).apply(block).build()

internal operator fun Deps.plus(child: Deps): Deps =
    object : Deps {
        override fun <T : Any> getOrNull(key: KClass<T>): T? =
            child.getOrNull(key) ?: this@plus.getOrNull(key)
    }

internal fun depsOf(map: DepsMap, parent: Deps? = null): Deps =
    object : Deps {
        override fun <T : Any> getOrNull(key: KClass<T>): T? =
            map.getOrNull(key) ?: parent?.getOrNull(key)
    }

private class DepsBuildable(
    private val parent: Deps? = null,
    private val map: MutableDepsMap = mutableMapOf()
) : Deps.Builder by depsBuilderOf(map, parent) {

    fun build(): Deps = depsOf(map.toMap(), parent)

}
