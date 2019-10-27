package io.lamart.deps

import DelegatingExample
import Person
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

    @Test
    fun gettingValues() {
        val deps = Deps {
            singleton(28)
            singleton("Danny")
        }
        val name: String = deps.get() // getting
        val (age: Int) = deps // destructuring
        val person = deps.get(::Person) // injecting

        assertEquals(name, "Danny")
        assertEquals(age, 28)
        assertEquals(person, Person("Danny", 28))
    }

    @Test
    fun delegatingValues() {
        val deps = Deps {
            singleton(28)
            singleton("Danny")
        }
        val wrapper = DelegatingExample(deps)

        assertEquals(wrapper.name, "Danny")
        assertEquals(wrapper.age, 28)
    }

}
