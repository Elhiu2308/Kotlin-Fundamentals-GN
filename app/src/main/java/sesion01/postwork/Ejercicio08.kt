package sesion01.postwork

/**
Ejercicio 8: Conversión de Tipos
Declara una variable de tipo String que contenga un número.
Conviértela a Int y luego a Double. Realiza una operación
aritmética con cada tipo y muestra los resultados.*/


fun main() {
    val codigoStr= "565254"
    val codigoInt= codigoStr.toInt()
    val codigoDou= codigoStr.toDouble()

    println("Código Integer + 1: ${codigoInt + 1}")
    println("Código Double + 1.2: ${codigoDou + 1.2}")
}
