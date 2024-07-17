package sesion03.postwork


/**
Ejercicio 1: Clase Libro
Crea una clase Libro con los atributos titulo, autor y añoPublicacion.
Incluye un constructor primario y un método para imprimir la información del libro.
 */
open class Libro(val titulo: String, val autor: String, val añoPublicacion: Int){
    fun imprimir(){
        println("'$titulo' por $autor ($añoPublicacion)")
    }
}
fun main(){
    val miLibro = Libro("1984", "George Onell", 1949)
    miLibro.imprimir()
}

