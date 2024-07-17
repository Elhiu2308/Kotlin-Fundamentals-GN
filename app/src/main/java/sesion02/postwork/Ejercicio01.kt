package sesion02.postwork

/**
Ejercicio 1: Calculadora de volumen de cilindro
Crea una función que calcule el volumen de un cilindro dado su radio y altura.*/

import kotlin.math.PI

fun cilindroVolumen(radio: Double, altura: Double): Double {
    return PI * radio * radio * altura
}


fun main() {
    val radio = 8.0
    val altura = 10.0

    val volumen = cilindroVolumen(radio, altura)

    println("El Volumen del cilindro es: %.2f unidades cubicas".format(volumen))

}
