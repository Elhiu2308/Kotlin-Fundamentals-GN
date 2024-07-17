package sesion04.postwork

/**
3. Interfaces
Crea una interfaz Volador con un método volar(). Luego, implementa esta interfaz en las clases Ave y Avion.
Crea una función que reciba un Volador y llame a su método volar().
 */

interface Volador {
    fun volar()
}

class Ave : Volador {
    override fun volar() {
        println("El ave vuela moviendo sus alas")
    }
}

class Avion : Volador {
    override fun volar() {
        println("El avión vuela usando motores")
    }
}

fun hacerVolar(volador: Volador) {
    volador.volar()
}

fun main() {
    val ave = Ave()
    val avion = Avion()

    hacerVolar(ave)   // Imprime: El ave vuela moviendo sus alas
    hacerVolar(avion) // Imprime: El avión vuela usando motores
}