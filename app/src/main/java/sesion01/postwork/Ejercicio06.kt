package sesion01.postwork

/**
Ejercicio 6: Operaciones con Strings
Declara dos variables de tipo String y:
Concaténalas usando el operador + Compara si son iguales
Obtén la longitud de ambas y suma los resultados Muestra los resultados.*/

fun main() {
    val codigo1:String = "LJD5662587"
    val codigo2:String = "LMD5651899"

    println("Concatenamos: ${codigo1 + " " + "a" + " " + codigo2}")
    println("El código 1 es igual al codigo 2 = ${codigo1==codigo2}")
    println("La longitud del código1 es= ${codigo1.length}")
    println("La longitud del código1 es= ${codigo2.length}")
    println("Suma de longitudes: ${codigo1.length + codigo2.length}")

}
