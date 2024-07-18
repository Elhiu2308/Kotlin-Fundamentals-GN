package sesion05.postwork

/**FUNCIONES INLINE*/

//inline fun saludar (nombre:String){
//    println("Hola, $nombre")
//}
//fun main(){
//    saludar("Maria")
//}
////fun main(){
////    println("Hola Maria!")
////}

/** Crea una función inline que tome una lambda como parámetro y la ejecute dentro de un bloque try-catch.
  Luego, usa esta función para ejecutar una operación que podría lanzar una excepción.
 */

inline fun ejecutarSeguro(operacion: () -> Unit) {
    try {
        operacion()
    } catch (e: Exception) {
        println("Se produjo una excepción: ${e.message}")
    }
}

fun main() {
    ejecutarSeguro {
        val resultado = 10 / 0
        println(resultado)
    }

    ejecutarSeguro {
        println("Esta operación es segura")
    }
}