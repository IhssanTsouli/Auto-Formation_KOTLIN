package KotlinBasics
fun main(){
    // "?" = can be null
    var fishFoodTreats = 6
    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats.dec()
    }
//!! = required
    fishFoodTreats = fishFoodTreats?.dec() ?: 0
 print("entrez votre nom")
 var a : Int = readLine()!!.toInt()
    println("votre nom est$a")
    var b : Int = readLine()!!
        .toInt()
    println("votre nom est$b")
    println(a+b)




}