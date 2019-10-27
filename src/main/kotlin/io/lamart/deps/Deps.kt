package io.lamart.deps

import kotlin.reflect.KClass

open class Deps(internal open val map: DepsMap = mapOf()) {

    fun <T : Any> getOrNull(key: KClass<T>): T? = map.getOrNull(key)

    companion object {
        operator fun invoke(block: Builder.() -> Unit): Deps =
            Builder().apply(block).build()
    }

    class Builder(override val map: MutableDepsMap = mutableMapOf()) : Deps(map) {

        operator fun <T : Any> set(key: KClass<T>, factory: () -> T) = map.set(key, factory)

        internal fun build(): Deps = map.toMap().let(::Deps)

        companion object {
            operator fun invoke(block: Builder.() -> Unit): Builder.() -> Unit = block
        }
    }

}
