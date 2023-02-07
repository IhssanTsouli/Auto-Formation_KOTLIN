package KotlinBasics
fun main(){
    val numberOfFish = 50
    val numberOfPlants = 23
    if (numberOfFish == 0) {
        println("Empty tank")
    } else if (numberOfFish < 40) {
        println("Got fish!")
    } else {
        println("That's a lot of fish!")
    }

    val fish = 50
    if (fish in 1..100) {
        println(fish)
    }
// when = switch
    when (numberOfFish) {
        0  -> println("Empty tank")
        in 1..39 -> println("Got fish!")
        else -> println("That's a lot of fish!")
    }
}

