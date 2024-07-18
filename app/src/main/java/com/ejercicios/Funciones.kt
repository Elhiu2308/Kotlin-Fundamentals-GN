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


//
//inline fun operacionMat(a: Int, b:Int, operacion: (Int, Int)->Int): Int{
//    return operacion(a,b)
//}
//
//fun main ()
//val resultado = operacionMat(5,3){x,y -> x + y}
//println(resultados)
//
//}

/**PARTITION*/
//fun main(){
//    val calificaciones = listOf(10,6,4,8,5,2,8,9,4,3,6,7,9,10,10,10)
//    val (notasAprobadas, notasReprobadas) =calificaciones.partition { it >= 6 }
//
//    println("Notas aprobadas :$notasAprobadas")
//    println("Notas reprobadas :$notasReprobadas")
//}

/**MAP*/
//fun main(){
//    val preciosLibres = setOf(1024.6, 2488.0, 8224.33)
//    val preciosFinales = preciosLibres.map { it * 1.16 }
//
//    println("Precios con IVA: $preciosFinales")
//}





/** NULL SAFETY*/

//fun main(){
//    var nombre: String? = "Juan"
//    println(nombre?.length)
//
//    nombre = null
//    println(nombre?.length)
//
//    val longitud = nombre?.length ?: 0 // ?: Operador elvis
//    println(longitud)
//}


/** Exceptions y Manejo de errores (try y catch) */

//fun main (){
//    try{
//        val resultado = 10 / 0
//        println(resultado)
//    } catch (e:ArithmeticException) {
//        println("Error: División por cero")
//    } finally {
//        println("Operación finalizada")
//    }
//}

/** UNSAFE CAST Y SAFE CAST*/

//fun main (){
//    val objeto:  Any = "Hola"
//
//    //Unsafe Cast
//    val texto1 = objeto as String
//    println(texto1.length)
//
//    //Safe Cast
//    val numero = objeto as? Int
//    println(numero)
//}


//

fun main () {
    val objeto: Any = 123
    try{
        val texto1 = objeto as String
        println(texto1.length)
    } catch (e: ClassCastException){
        println("Error: No se pudo convertir objeto a String")
    }
    val numero = objeto as? Int
    println(numero)
}

