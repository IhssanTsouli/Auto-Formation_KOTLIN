val Produits = mutableListOf<String>()
fun Ajouter(){
    print("Ajoutez un prouduit")
    var produit:String= readLine()!!.toString()
    Produits.add(produit)
}
fun afficher(){
    for(item in Produits){
        println(item)
    }
}
fun supprimer(){
    println("entrez un produit qui vous voulez supprimer")
    var produit_supprimer:String= readLine()!!.toString()
    Produits.remove(produit_supprimer)
    println(Produits)
}
fun main() {
    while (true){
        println("1-afficher")
        println("2-ajouter")
        println("3-supprimer")
        println("4-break")
        println("Chosait un nombre")
        var nbmenu:Int= readLine()!!.toInt()
        when(nbmenu){
            1->{
                println("------afficher------")
                afficher()
            }
            2->{
                println("------ajouter------")
                Ajouter()
            }
            3->{
                println("------supprimer------")
                supprimer()
            }
            4->{
                break
            }
        }
    }
}