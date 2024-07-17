package sesion01.postwork

/**
Ejercicio 10: Cálculo de IMC
Crea variables para el peso (en kg) y la altura (en metros) de una persona.
Calcula el Índice de Masa Corporal (IMC) usando
la fórmula: IMC = peso / (altura * altura) Muestra el resultado del IMC.*/


fun main() {
    val peso= 66.800
    val altura= 1.66
    val imc= peso / (altura*altura)


    println( "Tu Indice de Masa Muscular es = ${peso/(altura * altura)}")
    println( "Tu Indice de Masa Muscular es = ${imc}")

}

