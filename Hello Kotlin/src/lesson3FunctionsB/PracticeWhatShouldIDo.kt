package lesson3FunctionsB

fun main(args: Array<String>) {
//    val result = whatShouldIDoToday("sad")
//    println(result)

    print("What is your mood today? ")
    val moodInput = readLine()!!
    val result = whatShouldIDoToday2(moodInput)
    println(result)
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        mood == "happy" && weather == "sunny" -> "go for a walk"
        else -> "Stay home and read."
    }
}

fun whatShouldIDoToday2(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        isMoodHappy(mood) && isWeatherSunny(weather) -> "go for a walk"
        isMoodSad(mood) && isWeatherRainy(weather) && temperature == 0 -> "stay in bed"
        isMoodSad(mood) && isWeatherSunny(weather) -> "go out with friends"
        temperature > 35 -> "go swimming"
        else -> "Stay home and read."
    }
}

fun isMoodHappy(mood: String) = mood == "happy"

fun isMoodSad(mood: String) = mood == "sad"

fun isWeatherSunny(weather: String) = weather == "sunny"

fun isWeatherRainy(weather: String) = weather == "rainy"