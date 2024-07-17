package sesion05.postwork

/**
 Ejercicio 2:
 Uso simple de una función literal: Utiliza la función literal filter para obtener una lista de números pares de una lista dada.
 * */

val numeros = listOf(1,2,3,4,5,6,7,8,9,10)
val pares =  numeros.filter { it % 2 ==0}


fun main(){
    println(pares)
}


