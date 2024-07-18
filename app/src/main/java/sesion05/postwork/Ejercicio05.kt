package sesion05.postwork

/**
Ejercicio partition:
Vamos a trabajar con una lista de números y usaremos partition para separar los números pares de los impares.n a cada elemento de la lista y devolver una nueva lista con los resultados.
 * */


fun main(){
    val numeros = listOf(10,6,4,8,5,2,8,9,4,3,6,7,9,10,10,10,4,6,7)
    val (pares, impares) =numeros.partition { it % 2 == 0}

    println("Números pares :$pares")
    println("Números impares :$impares")
}



