package sesion01.postwork

/**
Ejercicio 9: Operaciones Booleanas
Crea tres variables booleanas y utiliza operadores lógicos (AND, OR, NOT)
para combinarlas. Muestra el resultado de al menos tres combinaciones diferentes.*/


fun main() {
    val a= true
    val b= false
    val c= true

    println(a && b)
    println(b || c)
    println( !c )

    println( "a And b = ${a && b}")
    println( "a OR c = ${a && c}")
    println( "NOT b OR c = ${!b || !c}")
    println("(a OR b) AND r: ${(a || b) && c}")


}
