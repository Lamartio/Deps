package io.lamart.deps.utils

class IncrementalIntFactory : () -> Int {

    var value = 0
        private set

    override fun invoke(): Int {
        try {
            return value
        } finally {
            value++

        }
    }

}