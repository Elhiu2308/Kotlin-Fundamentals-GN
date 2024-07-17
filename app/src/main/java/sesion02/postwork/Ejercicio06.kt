package sesion02.postwork


/**
Ejercicio 6: Contar vocales en una lista de palabras
Usa una lista y un ciclo para contar las vocales en una lista de palabras*/


fun conVocales(letras: List<String>): Int{

    val vocales = setOf('a', 'e', 'i', 'o', 'u')
    var totalVocales = 0

    for (letras in letras) {
        totalVocales += letras.count { it in vocales }
    }

    return totalVocales
}


fun main() {
    val listaNombres = listOf("Christian", "Sergio", "Miguel")
    println("Total de vocales: ${conVocales(listaNombres)}")
}

