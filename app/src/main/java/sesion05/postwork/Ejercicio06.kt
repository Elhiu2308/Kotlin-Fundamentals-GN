package sesion05.postwork

/**
Ejercicio partition:
Vamos a trabajar con una lista de precios y usaremos partition para aumentar el IVA a cada elemento de la lista y devolver una nueva lista con los resultados.
 * */


fun main(){
    val preciosLibres = setOf(1024.6, 2488.0, 8224.33)
    val preciosFinales = preciosLibres.map { it * 1.16 }

    println("Precios con IVA: $preciosFinales")
}



