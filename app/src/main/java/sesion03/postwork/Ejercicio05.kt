package sesion03.postwork


/**
Ejercicio 5: Clase con Propiedades Lazy
Crea una clase Calculadora con una propiedad pi que se inicialice de manera perezosa (lazy) y un método para calcular el área de un círculo.
 */

class Calculadora {
    val pi: Double by lazy {
        println("Calculando pi...")
        3.14159265359
    }

    fun areaCirculo(radio: Double): Double {
        return pi * radio * radio
    }
}

fun main() {
    val calc = Calculadora()
    println("Área de un círculo con radio 5: ${calc.areaCirculo(5.0)}")
    println("Área de un círculo con radio 3: ${calc.areaCirculo(3.0)}")
}



