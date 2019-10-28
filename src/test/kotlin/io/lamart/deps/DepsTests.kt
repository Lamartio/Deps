package io.lamart.deps

import io.lamart.deps.utils.DelegatingExample
import io.lamart.deps.utils.IncrementalIntFactory
import io.lamart.deps.utils.Person
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull
import kotlin.test.assertSame

class DepsTests {

    @Test
    fun singletonOrFactory() {
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
    fun dependencyGraph() {
        val parent = Deps {
            singleton(0)
        }
        val child = parent + Deps {
            singleton(1)
        }
        val ascendant = child + listOf(
            Deps { singleton(2) },
            Deps { singleton(3) }
        )

        assertEquals(parent.get(), 0)
        assertEquals(child.get(), 1)
        assertEquals(ascendant.get(), 3)
    }

    @Test
    fun gettingValues() {
        val deps = Deps {
            singleton(Unit)
            singleton(28)
            singleton("Danny")
        }
        val name: String = deps.get() // getting
        val (age: Int) = deps // destructuring
        val person = deps.get(::Person) // injecting
        val unit: Unit by deps // delegating

        assertEquals(name, "Danny")
        assertEquals(age, 28)
        assertEquals(person, Person("Danny", 28))
        assertSame(unit, Unit)
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

    @Test
    fun polymorphism() {
        val deps1 = Deps {
            singleton("HelloWorld")
        }
        val deps2 = Deps {
            singleton("HelloWorld" as CharSequence)
        }
        val deps3 = Deps {
            singleton("HelloWorld")
            singleton("HelloWorld" as CharSequence)
        }

        assertNull(deps1.getOrNull(CharSequence::class))

        assertNull(deps2.getOrNull(String::class))
        assertNotNull(deps2.getOrNull(CharSequence::class))

        assertNotNull(deps3.getOrNull(String::class))
        assertNotNull(deps3.getOrNull(CharSequence::class))
    }


    @Test
    fun builders() {
        val deps = Deps {
            singleton("Danny")
            singleton(28)
            singleton { name: String, age: Int -> Person(name, age) }
            singleton { -> Person(get(), get()) }
            singleton(::Person)
        }

        assertEquals(deps.get(), Person("Danny", 28))
    }

}
