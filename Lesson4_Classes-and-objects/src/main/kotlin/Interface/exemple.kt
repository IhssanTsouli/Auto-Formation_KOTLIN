package Interface
interface FishColor {
    val color: String
    fun eat()
}
class exemple : FishColor {
    override val color = "gold"
    override fun eat() {
        println("eat algae")
    }

}