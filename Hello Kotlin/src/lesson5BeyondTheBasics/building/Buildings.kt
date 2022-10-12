package lesson5BeyondTheBasics.building

open class BaseBuildingMaterial(
    var numberNeeded: Int =1
) {

}

class Wood(numberNeeded: Int = 4): BaseBuildingMaterial(numberNeeded) {

}

class Brick(numberNeeded: Int = 8): BaseBuildingMaterial(numberNeeded) {

}

class Building<T: BaseBuildingMaterial>(val material: T){
    val baseMaterialNeeded = 100
    val actualMaterialsNeeded = baseMaterialNeeded * material.numberNeeded

    fun build() {
        println("$actualMaterialsNeeded ${material::class.simpleName} required")
    }
}

fun main(args: Array<String>) {
    val building = Building(Wood())
    building.build()
}

fun <T: BaseBuildingMaterial>isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded<500) {
        println("small building")
    } else {
        println("large building")
    }
}