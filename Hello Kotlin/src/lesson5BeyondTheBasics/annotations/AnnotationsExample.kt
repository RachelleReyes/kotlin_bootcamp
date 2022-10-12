package lesson5BeyondTheBasics.annotations

import kotlin.reflect.full.findAnnotation

@ImAPlant class Plant {
    fun trim() {}
    fun fertilize() {}

    @get:OnGet
    val isGrowing: Boolean = true

    @set:OnSet
    var needsFood: Boolean = false
}

annotation class ImAPlant

@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class OnGet

@Target(AnnotationTarget.PROPERTY_SETTER)
annotation class OnSet

fun reflections() {
    val classObj = Plant::class

    // Print all annotations
    for(annotation in classObj.annotations) {
        println(annotation.annotationClass.simpleName)
    }

    // Find one annotation, or null
    val annotated = classObj.findAnnotation<ImAPlant>()

    annotated?.apply {
        println("Found a plant annotation!")
    }
}