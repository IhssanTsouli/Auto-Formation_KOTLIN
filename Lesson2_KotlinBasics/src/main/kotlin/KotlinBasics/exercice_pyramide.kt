package KotlinBasics

fun main(){
    println("entrer un nombre de linge")
    var n:Int= readLine()!!.toInt()
    for(i in 1..n ){

        for(j in 1..n - i){
            print(" ")
        }
        for(k in 1.. (i * 2) -1){
            print("*")
        }
          println()
    }
}