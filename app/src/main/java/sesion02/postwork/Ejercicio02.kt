package sesion02.postwork

/**
Ejercicio 2: Verificador de número primo
Implementa una función que determine si un número es primo.*/

fun numPrimo(numero: Int): Boolean {
    if ( numero <= 1) return false
    if ( numero <= 3) return false

    if ( numero % 2 == 0 || numero % 3 == 0) return false

    var i = 5
    while( i * i <= numero ) {
        if(numero % i == 0 || numero % (i+2) == 0) return false
        i +=6
    }

    return true
}

fun main () {
    val numero = 17
    val resultado = if(numPrimo(numero))"es" else "no es"
    println("El numero $numero $resultado primo")
}


