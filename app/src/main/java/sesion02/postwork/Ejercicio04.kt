package sesion02.postwork


/**
Ejercicio 4: Clasificador de edades usando when
Crea una función que clasifique a una persona según su edad utilizando when.*/

fun clasificadorEdades(edad: Int){

    when(edad) {
        0 -> println("Recien nacido")
        in 1..2 -> println("Bebe")
        in 4..12 -> println("Niño")
        in 13..17 -> println("Adolescente")
        in 18..59 -> println("Adulto")
        in 60..99 -> println("Tercera edad")
        else -> println("Milagro")
    }

}


fun main() {
    clasificadorEdades(0)
    clasificadorEdades(11)
    clasificadorEdades(15)
    clasificadorEdades(43)
    clasificadorEdades(72)
    clasificadorEdades(108)
}

