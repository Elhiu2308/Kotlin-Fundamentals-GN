package sesion03.postwork


/**
Ejercicio 2: Clase Cuenta Bancaria
Diseña una clase CuentaBancaria con un atributo privado saldo. Incluye métodos para depositar, retirar y consultar saldo.
 */

class CuentaBancaria(saldoInicial: Double) {
    private var saldo = saldoInicial

    fun depositar(monto: Double) {
        saldo += monto
        println("Depósito de $monto realizado. Nuevo saldo: $saldo")
    }

    fun retirar(monto: Double) {
        if (monto <= saldo) {
            saldo -= monto
            println("Retiro de $monto realizado. Nuevo saldo: $saldo")
        } else {
            println("Saldo insuficiente")
        }
    }

    fun consultarSaldo() = println("Saldo actual: $saldo")
}

fun main() {
    val cuenta = CuentaBancaria(100.0)
    cuenta.depositar(500.0)
    cuenta.retirar(300.0)
    cuenta.consultarSaldo()
}