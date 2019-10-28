package io.lamart.deps.utils

import io.lamart.deps.Deps
import io.lamart.deps.getValue

class DelegatingExample(deps: Deps) {

    val name: String by deps
    val age: Int by deps

}