package sesion04.postwork

/**
5. Companion Object
Crea una clase Contador con un companion object que mantenga un contador global de instancias creadas.
Cada vez que se cree una nueva instancia de Contador, el contador global debe incrementarse. */

class Contador {
    companion object {
        private var contadorGlobal = 0

        fun obtenerContadorGlobal(): Int {
            return contadorGlobal
        }
    }

    init {
        contadorGlobal++
    }
}

fun main() {
    println(Contador.obtenerContadorGlobal()) // 0

    val contador1 = Contador()
    println(Contador.obtenerContadorGlobal()) // 1

    val contador2 = Contador()
    val contador3 = Contador()
    println(Contador.obtenerContadorGlobal()) // 3
}