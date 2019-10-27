package io.lamart.deps

import org.junit.Test
import kotlin.test.assertEquals

class DepsTests {

    @Test
    fun singletonTest() {
        val factory = Deps {
            factory(IncrementalIntFactory())
        }
        val singleton = Deps {
            singleton(IncrementalIntFactory())
        }

        assertEquals(factory.get(), 0)
        assertEquals(factory.get(), 1)

        assertEquals(singleton.get(), 0)
        assertEquals(singleton.get(), 0)
    }

    @Test
    fun graphTest() {
        val parent = Deps {
            singleton { -> 0 }
        }
        val child = parent + {
            singleton { -> 1 }
        }

        assertEquals(parent.get(), 0)
        assertEquals(child.get(), 1)
    }

}
