package sesion03.postwork


/**
Ejercicio 6: Clase con Métodos de Extensión
Define una clase Persona con propiedades nombre y edad. Luego, crea un método de extensión para imprimir un saludo personalizado.
 */

class Persona(val nombre: String, val edad: Int)

fun Persona.saludar() {
    println("Hola, mi nombre es $nombre y tengo $edad años.")
}

fun main() {
    val persona = Persona("Ana", 28)
    persona.saludar()
}

