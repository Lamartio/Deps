package io.lamart.deps

import kotlin.reflect.KClass

internal typealias DepsMap = Map<KClass<*>, () -> Any>

internal typealias MutableDepsMap = MutableMap<KClass<*>, () -> Any>

@Suppress("UNCHECKED_CAST")
internal fun <T : Any> DepsMap.getOrNull(key: KClass<T>): T? =
    get(key)?.invoke()?.let { it as T }
