package sesion05.postwork

/**
Ejercicio 3: Función de orden superior personalizada
Crea una función de orden superior llamada aplicarOperacion que tome dos números y una función, y aplique esa función a los números. * */


//fun aplicarOperacion(x: Int, y: Int, suma: (Int, Int) -> Int): Int {
//    return suma(x,y)
//}
//fun suma(a: Int, b: Int) = a + b
//fun main(){
//    val suma = aplicarOperacion(10, 5, ::suma)
//println(suma)
//}


fun aplicarOperacion(a: Int, b: Int, operacion: (Int, Int) -> Int): Int{
    return operacion(a,b)
}
val suma = aplicarOperacion(5, 3){ x, y -> x + y}
fun main(){
    println("Suma: $suma")
}