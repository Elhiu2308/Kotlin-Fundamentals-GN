package sesion02.postwork


/**
Ejercicio 7: Diccionario de sinónimos
Crea un mapa de sinónimos y una función para obtener sinónimos de una palabr*/


val sinonimos = mapOf(
    "feliz" to listOf("contento", "alegre", "dichoso"),
    "triste" to listOf("melancólico", "abatido", "apenado"),
    "enojado" to listOf("furioso", "irritado", "colérico")
)

fun obtenerSinonimos(palabra: String): List<String> {
    return sinonimos[palabra.lowercase()] ?: listOf("No se encontraron sinónimos")
}

fun main() {
    println("Sinónimos de 'feliz': ${obtenerSinonimos("feliz")}")
    println("Sinónimos de 'cansado': ${obtenerSinonimos("cansado")}")
}