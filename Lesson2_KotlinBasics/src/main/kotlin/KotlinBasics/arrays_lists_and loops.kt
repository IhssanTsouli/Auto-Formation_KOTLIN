package KotlinBasics
 fun main () {
  //Step 1: Make lists
  val school = listOf("mackerel", "trout", "halibut")
  println(school)

//Step 2: Create arrays
  val school2 = arrayOf("shark", "salmon", "minnow")
  println(java.util.Arrays.toString(school2))
//Step 3: Make loops
  val school3 = arrayOf("shark", "salmon", "minnow")
  for (element in school3) {
   print(element + " ")
  }
 }


