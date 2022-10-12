package lesson5BeyondTheBasics.generics

open class WaterSupply(var needsProcessed: Boolean)

class TapWater: WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessed = false
    }
}

class FishStoreWater: WaterSupply(false)

class LakeWater: WaterSupply(true) {
    fun filter() {
        needsProcessed = false
    }
}

// Add "Any" to make sure it's not nullable
//class Aquarium<T:Any>(val waterSupply: T)
class Aquarium<out T: WaterSupply>(val waterSupply: T) {
    fun addWater(cleaner: Cleaner<T>){
        if(waterSupply.needsProcessed) {
            cleaner.clean(waterSupply)
        }
        println("adding water from $waterSupply")
    }
}

fun genericExample() {
    val aquarium = Aquarium<TapWater>(TapWater())
    aquarium.waterSupply.addChemicalCleaners()

//    val aquarium2 = Aquarium("string")
//    println(aquarium2.waterSupply)

//    val aquarium3 = Aquarium(null)
//    aquarium3.waterSupply

//    val aquarium4 = Aquarium(LakeWater())
//    aquarium4.waterSupply.filter()
//    aquarium4.addWater()

}

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("item added")

interface Cleaner<in T: WaterSupply> {
    fun clean(waterSupply: T)
}

class TapWaterCleaner: Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) {
        waterSupply.addChemicalCleaners()
    }
}

fun genericExample2() {
    val cleaner = TapWaterCleaner()
    val aquarium = Aquarium(TapWater())
    aquarium.addWater(cleaner)
}

fun main() {
    genericExample2()
}


// We use * when we don't care about the type
inline fun <reified R: WaterSupply> Aquarium<*>.hasWaterSupplyOfType() = waterSupply is R


fun <T: WaterSupply> isWaterClean(aquarium: Aquarium<T>) {
    println("aquarium water is clean: ${aquarium.waterSupply.needsProcessed}")
}

inline fun <reified T: WaterSupply> WaterSupply.isOfType() = this is T

fun genericExample3() {
    val aquarium = Aquarium(TapWater())
    isWaterClean(aquarium)
    aquarium.hasWaterSupplyOfType<TapWater>()
    aquarium.waterSupply.isOfType<LakeWater>()
}