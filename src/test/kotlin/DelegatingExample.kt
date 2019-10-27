import io.lamart.deps.Deps
import io.lamart.deps.asLazy
import io.lamart.deps.asProperty

class DelegatingExample(deps: Deps) {

    val name: String by deps.asProperty()
    val age: Int by deps.asLazy()

}