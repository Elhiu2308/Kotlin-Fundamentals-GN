package sesion01.postwork

/**
Ejercicio 1: Declaración de Variables
Declara variables para representar la información de un producto:

Nombre del producto (String)
Precio (Double)
Disponible en inventario (Boolean)
Código de producto (String) Imprime todas las variables..**/

fun main() {
    val producto:String = "Coca Cola"
    val precio:Double = 17.99
    val disponibilidad:Boolean = true
    val codigo:String = "#JH-5575153318"

    println("Producto: $producto")
    println("Precio: $precio")
    println("Disponible: $disponibilidad")
    println("Código: $codigo")

    println("$producto cuesta $precio y $disponibilidad disponible con el número de inventario $codigo")

}


