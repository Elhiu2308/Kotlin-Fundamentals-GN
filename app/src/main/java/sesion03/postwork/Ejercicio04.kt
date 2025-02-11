package sesion03.postwork

/**
Ejercicio 4: Getters y Setters Personalizados
Implementa una clase Temperatura con un atributo en Celsius. Incluye getters y setters personalizados para obtener y establecer la temperatura en Fahrenheit.
 */

class Temperatura(celsius: Double) {
    var celsius = celsius
        set(value) {
            field = value
            println("Temperatura establecida a $value°C")
        }

    var fahrenheit: Double
        get() = celsius * 9/5 + 32
        set(value) {
            celsius = (value - 32) * 5/9
            println("Temperatura establecida a $value°F")
        }
}

fun main() {
    val temp = Temperatura(25.0)
    println("En Fahrenheit: ${temp.fahrenheit}°F")
    temp.fahrenheit = 68.0
    println("En Celsius: ${temp.celsius}°C")
}

