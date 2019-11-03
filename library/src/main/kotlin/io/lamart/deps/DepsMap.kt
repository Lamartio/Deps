package io.lamart.deps

import kotlin.reflect.KClass

internal typealias DepsMap = Map<KClass<*>, () -> Any>

internal typealias MutableDepsMap = MutableMap<KClass<*>, () -> Any>

@Suppress("UNCHECKED_CAST")
internal fun <T : Any> DepsMap.getOrNull(key: KClass<T>): T? =
    get(key)?.invoke()?.let { it as T }

class ImmutableException : Throwable()

internal fun MutableDepsMap.toImmutableMap(): MutableDepsMap = let { map ->
    object : MutableDepsMap, DepsMap by map {

        override val entries: MutableSet<MutableMap.MutableEntry<KClass<*>, () -> Any>>
            get() = map.entries
        override val keys: MutableSet<KClass<*>>
            get() = map.keys
        override val values: MutableCollection<() -> Any>
            get() = map.values

        override fun clear() = IMMUTABLE()

        override fun put(key: KClass<*>, value: () -> Any): (() -> Any)? = IMMUTABLE()

        override fun putAll(from: Map<out KClass<*>, () -> Any>) = IMMUTABLE()

        override fun remove(key: KClass<*>): (() -> Any)? = IMMUTABLE()

        private fun IMMUTABLE(): Nothing {
            throw ImmutableException()
        }

    }
}
