package lesson4Classes.aquarium

interface AquariumAction {
    fun eat()
    fun jump()
    fun clean()
    fun catchFish()
    fun swim() {
        println("swim")
    }
}

interface FishAction2 {
    fun eat()
}

abstract class AquariumFish2: FishAction {
    abstract val color: String
    override fun eat() = println("yum")
}