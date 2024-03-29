package lesson4Classes.aquarium

fun main(args: Array<String>) {
    delegate()
}

fun delegate() {
    val pleco = Plecostomus2()
    println("Fish has color ${pleco.color}")
    pleco.eat()
}

interface FishAction3 {
    fun eat()
}

interface FishColor {
    val color: String
}

//class Plecostomus2: FishAction3,
//        FishColor by GoldColor {
//    override fun eat() {
//        println("eat algae")
//    }
//}
//object GoldColor: FishColor {
//    override val color = "gold"
//}

class Plecostomus2(fishColor: FishColor = GoldColor):
        FishAction by PrintingFishAction("a lot of algae"),
        FishColor by GoldColor

object GoldColor: FishColor {
    override val color = "gold"
}

object RedColor: FishColor {
    override val color = "red"
}

class PrintingFishAction(val food: String): FishAction {
    override fun eat() {
        println(food)
    }
}

