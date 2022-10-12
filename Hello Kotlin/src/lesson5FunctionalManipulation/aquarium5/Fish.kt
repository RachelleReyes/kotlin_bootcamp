package lesson5FunctionalManipulation.aquarium5

data class Fish(var name: String)

fun main(args: Array<String>) {
    fishExample()
}

fun fishExample(){
    val fish = Fish("splashy")

//    myWith(fish.name) {
//        println(capitalize())
//    }

    // without inline an object is created every call to myWith
    myWith(fish.name, object: Function1<String, Unit> {
        override fun invoke(name: String) {
            name.capitalize()
        }
    })

    // with inline no object is created every call to myWith
    fish.name.capitalize()

    // Takes one lambda as its argument and returns the result of executing the lambda
    println(fish.run {name})
    // Takes one lambda as its argument and returns the object it's applied to
    println(fish.apply {})

    val fish2 = Fish("splashy").apply { name="Sharky" }
    println(fish2.name)

    // Let returns a copy of the object, useful for chaining manipulations together
    println(fish.let{ it.name.capitalize()}
        .let{ it + "fish"}
        .let{ it.length }
        .let { it + 31 }
    )

}

//fun myWith(name: String, block: String.() -> Unit) {
//    name.block()
//}

inline fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}