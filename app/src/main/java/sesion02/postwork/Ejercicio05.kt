package sesion02.postwork

/**
Ejercicio 5: Imprimir números pares en un rango
Utiliza un ciclo for para imprimir los números pares en un rango dado.*/


fun numerosPares(ini: Int, fin: Int){

    for (i in ini..fin step 2) {
        if (i % 2 == 0) {
            println(i)
        }
    }
}

fun main() {
    numerosPares(0, 20)
}


