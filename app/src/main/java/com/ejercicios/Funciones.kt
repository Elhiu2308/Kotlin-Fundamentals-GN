package com.ejercicios

/**Las funciones literales se pueden clasificar en dos tipos:
 *
 * Funciones que no se declaran con un nombre especifico y se pueden asignar a variables o pasarse como argumentos.

*Expresiones lambda
*Funciones anónimas
 *
Expresiones lambda
Las expresiones lambda tienen la siguiente estructura:

val <nombre_lambda>: = { -> }

El tipo en la constante definiría el tipo de función. Si tenemos una función que recibe como parámetro dos enteros y regresa un double, tendríamos que definirla de la siguiente forma:

val f: (Int, Int) -> Double
Veamos un ejemplo básico de cómo declarar una lambda almacenada en la variable suma
 * */

//fun main(){
//    val suma = {a: Int, b: Int -> a+b}
//    println(suma(3,5))
//}


//val numeros = listOf(1,2,3,4,5)
//val pares =  numeros.filter { it % 2 ==0} //filter operacion funcional (filtrado del contenido los que sean multiplos de 2)
//fun main(){
//    println(pares)
//}


/**FUNCIONES DE ORDEN SUPERIOR
 *
 * Funcion que puede recibir como parametro una funcion y regresar otra funcion
 *
 *Para declarar una función de orden superior, vamos a usar la notación que ya conocemos, con la diferencia de que dentro de los paréntesis (donde van nuestros parámetros)
 * por una parte van los parámetros y por otra va la función que recibirá nuestra Higher-order function.
 *
 * Las Higher-order functions aparte de recibir variables como parámetros, también pueden recibir funciones como parámetros e incluso retornarlas.
 * */


//fun operarConNumeros(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
//    return operacion(a,b)
//}
//fun main(){
//val resultadoSuma = operarConNumeros(5,3) {x,y -> x + y}
//println(resultadoSuma)
//
//val resultadoMultiplicacion = operarConNumeros(5,3) {x,y -> x * y}
//println(resultadoMultiplicacion)
//}



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


inline fun operacionMate(a: Int, b: Int, operacion: (Int, Int) -> Int)
