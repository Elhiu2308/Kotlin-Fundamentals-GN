package clase04.postwork

/**
1. Herencia y Polimorfismo
Crea una clase base Animal con un método hacerSonido().
Luego, crea dos clases derivadas Perro y Gato que hereden de Animal y sobrescriban el método hacerSonido().
Finalmente, crea una función que reciba un Animal y llame a su método hacerSonido().
 */

open class Animal {
    open fun hacerSonido() {
        println("El animal hace un sonido")
    }
}

class Perro : Animal() {
    override fun hacerSonido() {
        println("El perro ladra")
    }
}

class Gato : Animal() {
    override fun hacerSonido() {
        println("El gato maulla")
    }
}

fun hacerSonar(animal: Animal) {
    animal.hacerSonido()
}

fun main() {
    val perro = Perro()
    val gato = Gato()

    hacerSonar(perro) // Imprime: El perro ladra
    hacerSonar(gato)  // Imprime: El gato maulla
}