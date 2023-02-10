fun main() {
   println( decorations.filter {it[0] == 'p'})
    //val filtered = decorations.asSequence().filter { it[0] == 'p' }
   // println("filtered: $filtered")
    val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
        println("access: $it")
        it
    }
    println("-----")
    println("filtered: ${lazyMap2.toList()}")
}
val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

