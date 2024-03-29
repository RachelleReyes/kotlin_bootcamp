package lesson4Classes.aquarium

fun main(args: Array<String>) {
    buildAquarium()
    makeFish()
}

fun buildAquarium(){
    val myAquarium = Aquarium()

    println("Length: ${myAquarium.length} " +
            "Width: ${myAquarium.width} " +
            "Height: ${myAquarium.height}")

    myAquarium.height = 80

    println("Height: ${myAquarium.height} cm")

    println("Volume: ${myAquarium.volume} liters")

    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
    println("Small Aquarium ${smallAquarium.volume} liters")

    val myAquarium2 = Aquarium(numberOfFish = 9)
    println("Small Aquarium 2: ${myAquarium2.volume} liters with " +
            "Length: ${myAquarium2.length} " +
            "Width: ${myAquarium2.width} " +
            "Height: ${myAquarium2.height}")
}

fun feedFish(fish: FishAction) {
    fish.eat()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color} \n Pleocstomus: ${pleco.color}")

    shark.eat()
    pleco.eat()
}