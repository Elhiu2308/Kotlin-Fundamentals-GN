package sesion04.postwork

/**
6. Herencia Múltiple con Interfaces
Crea dos interfaces Nadador y Corredor con métodos nadar() y correr() respectivamente. Luego, crea una clase Triatleta que implemente ambas interfaces.
Finalmente, crea una función que reciba un objeto y verifique si puede nadar, correr o ambos.
 */

interface Nadador {
    fun nadar()
}

interface Corredor {
    fun correr()
}

class Triatleta : Nadador, Corredor {
    override fun nadar() {
        println("El triatleta está nadando")
    }

    override fun correr() {
        println("El triatleta está corriendo")
    }
}

fun verificarHabilidades(obj: Any) {
    if (obj is Nadador) {
        obj.nadar()
    }
    if (obj is Corredor) {
        obj.correr()
    }
}

fun main() {
    val triatleta = Triatleta()
    verificarHabilidades(triatleta)
}