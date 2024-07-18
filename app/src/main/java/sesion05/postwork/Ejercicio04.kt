package sesion05.postwork

/**
Ejercicio 4:
Crea una función de orden superior llamada transformarLista que tome una lista de números enteros y una función de transformación.
La función debe aplicar la transformación a cada elemento de la lista y devolver una nueva lista con los resultados.
 * */


fun main(){
fun transformarLista(lista: List<Int>, transformacion: (Int) -> Int): List <Int> {
    return lista.map {transformacion(it)} //.map permite cambiar los elementos dentro de una lista
}

    val numeros = listOf(1, 2, 3, 4, 5)

    val listaDoble = transformarLista(numeros){ it * 2}
    println("Lista duplicada: $listaDoble")
}



