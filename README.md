[ ![Download](https://api.bintray.com/packages/lamartio/maven/Deps/images/download.svg) ](https://bintray.com/lamartio/maven/Deps/_latestVersion)
# Deps
There are some awesome Dependency Injection libraries out there, but I found them having so much features we don't need. Instead of creating a lot of features, I decided to make the features we need as good as possible. That is; storing and injecting dependencies.

The idea behind Dependency Inversion comes down to an object that is capable of storing other objects and applying those into a constructor, method or function. In this library this object is called `Deps`.

```groovy
implementation 'io.lamart.deps:deps:1.0.0'
```

## Injecting dependencies
The library's primary aim is to make injection as easy as possible and base it purely on Kotlin's syntax.
```kotlin
data class Person(val name: String, age: Int)

fun injectionExample(deps: Deps) {
    val name: String = deps.get() // getting
    val (name: String) = deps // destructuring
    val name: String by deps // delegating
    val person: Person = deps[::Person] // injecting
}
``` 
## Storing dependencies
 A container has two ways of storing dependencies; by factory or singleton. The prior will return a new instance every time it got retrieved and the latter creates an instance once it got retrieved for the first time.
```kotlin
fun creationExample() : Deps {
    return Deps { // this: Deps.Builder

        factory { -> "Danny" }
        singleton { -> "Danny" }
        singleton(28) // simple values can be stored directly
       
        // multiple ways to store objects that require dependencies
        singleton { name: String, age: Int -> Person(name, age) }
        singleton { -> Person(get(), get()) }
        singleton(::Person)

    } 
}
```
P.S. The arrows within the lambda are necessary to specify which overload is required.

P.P.S. Dependencies got stored by type, so in the in example above the `singleton { -> "Danny" }` takes precedence over `factory { -> "Danny" }`.
## Building graphs
Often libraries build graphs by defining modules and/or components, but `Deps` are much simpler since you can just sum up `Deps` into new `Deps`.
```kotlin
fun configModule() : Deps = Deps { /* ... */ }
fun networkModule() : Deps = Deps { /* ... */ }
fun filesModule() : Deps = Deps { /* ... */ }
fun databaseModule() : Deps = Deps { /* ... */ }

fun persistenceModule() : List<Deps> = listOf(filesModule(), databaseModule())

fun appModule() : Deps = configModule() + networkModule() + persistenceModule()
```
The dependency resolution strategy is that the latter takes precedence over the former. In the `appModule()` example above that means that a dependency first get resolved in the `persistenceModule()`, then in the `networkModule()` and then in the `configModule()`.
## Q&A
#### Is Deps thread safe?
After building a `Deps` the object becomes immutable and thereby thread safe. 
#### Deps stores values by type, so how do I store multiple strings?
Deps only allow to store one string. When storing a second string, it will overwrite the previous one. If you need to store multiple objects of the same type, you can use Kotlin's `inline class`, create a marker interface, or subclass it.
