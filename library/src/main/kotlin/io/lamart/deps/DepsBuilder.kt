package io.lamart.deps

import kotlin.reflect.KClass

class DepsBuilder private constructor(var map: MutableDepsMap = mutableMapOf()) : Deps by DepsInstance(map) {

    operator fun <T : Any> set(key: KClass<T>, factory: () -> T) = map.set(key, factory)

    companion object {

        internal operator fun invoke(initializer: DepsBuilder.() -> Unit): DepsBuilder =
            DepsBuilder()
                .apply(initializer)
                .apply { map = map.toImmutableMap() }

    }

}
