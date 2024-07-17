package sesion02.postwork

/**
Ejercicio 3: Validador de email con función local
Desarrolla una función que valide una dirección de email utilizando una función local.*/

fun validarEmail(email: String): Boolean {
    fun caracteresEmail(str: String): Boolean {
        return str.contains("@") && str.contains(".")
    }

    return email.isNotEmpty() && caracteresEmail(email)
}

fun main() {
    println("¿El correo elhiuchristian@hotmail.com es valido? ${validarEmail("elhiuchristian@hotmail.com")}")
    println("¿El correo invalid-email es valido? ${validarEmail("invalid-email")}")
}

