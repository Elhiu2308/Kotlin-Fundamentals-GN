package sesion04.postwork

/**
4. Data Classes
Crea una data class Libro con propiedades para título, autor y año de publicación.
Luego, crea una lista de libros y utiliza las funciones generadas automáticamente para copiar un libro y comparar dos libros.
 */

data class Libro(val titulo: String, val autor: String, val anioPublicacion: Int)

fun main() {
    val libro1 = Libro("1984", "George Orwell", 1949)
    val libro2 = Libro("Cien años de soledad", "Gabriel García Márquez", 1967)
    val libro3 = libro1.copy(titulo = "Rebelión en la granja")

    val libros = listOf(libro1, libro2, libro3)

    println(libro1 == libro2) // false
    println(libro1 == libro1.copy()) // true

    libros.forEach { println(it) }
}