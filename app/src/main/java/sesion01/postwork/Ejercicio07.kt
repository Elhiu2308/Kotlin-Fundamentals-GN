package sesion01.postwork

/**
Ejercicio 7: Cálculo de Descuento
Crea variables para el precio de un producto y el porcentaje de descuento.
Calcula el precio final después del descuento. Muestra el precio original,
el descuento y el precio final.*/

fun main() {
    val precio = 7500.00
    val descuento = 10
    val operacion =  precio * descuento /100
    val precioFinal = precio - operacion


    println("El precio ya con descuento es = ${precioFinal}")

}
