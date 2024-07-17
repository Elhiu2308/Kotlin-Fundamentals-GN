package sesion03.postwork

/**
Ejercicio 3: Clase con Constructor Secundario
Crea una clase Rectangulo con atributos ancho y alto.
Incluye un constructor primario y un constructor secundario que inicialice ambos valores con el mismo número.
 */

class figuraGeometrica(val ancho: Double, val alto: Double){

    constructor (lado: Double): this(lado,lado)

    fun area() = ancho * alto
}


fun main() {
    val rectangulo = figuraGeometrica(2.5, 3.0)
    val cuadrado = figuraGeometrica(2.5)

    println("Área del rectángulo: ${rectangulo.area()}")
    println("Área del cuadrado: ${cuadrado.area()}")
}



