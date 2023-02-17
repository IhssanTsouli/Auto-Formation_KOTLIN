package Exercice3
var mes_produits=ArrayList<String>()
interface IProduits{
    fun Ajouter()
    fun Afficher()
    fun Supprimer()

}

class Produits : IProduits {
    override fun Ajouter() {
        println("Ajoutez un produit")
        var produit= readLine().toString()
        mes_produits.add(produit)
    }

    override fun Supprimer() {
        println("entrez un produit qui vous voulez supprimer")
        var produit= readLine().toString()
        mes_produits.remove(produit)
        println(mes_produits)
    }
    override fun Afficher() {
        if(mes_produits.size==0){
            println("aucun produit n'est disponible.")
        }else{
            for (index in mes_produits){
                println(index)
            }
        }
    }
}

fun main() {
    while (true) {
        println("1-affiche")
        println("2-ajouter")
        println("3-supprimer")
        println("4-break")
        println("Chosait un nombre")
        var choix: Int = readLine()!!.toInt()
        var produit = Produits()
        when (choix) {
            1 -> {
                println("------afficher------")
                produit.Afficher()
            }

            2 -> {
                println("------ajouter------")
                produit.Ajouter()
            }

            3 -> {
                println("------supprimer------")
                produit.Supprimer()
            }

            4 -> {
                break
            }
            else ->{
                println(" saisir un nombre entre 1 et 4")
            }
        }
    }
}
