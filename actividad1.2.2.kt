fun main() {
    // Declarar dos variables numericas
    val numero1: Int = 8
    val numero2: Double = 2.5

    // Operaciones aritmeticas
    val suma = numero1 + numero2
    val resta = numero1 - numero2
    val multiplicacion = numero1 * numero2
    val division = numero1 / numero2

    // Imprimir resultados
    println("La suma es: $suma")
    println("La resta es: $resta")
    println("La multiplicacion es: $multiplicacion")
    println("La division es: $division")

    // Seguridad ante nulos (Null Safety)
    var texto: String? = "Actividad 1.2.2"
    println("Longitud del texto: ${texto?.length}")
    texto = null
    println("Longitud del texto despues de asignar null: ${texto?.length}")

    // Pregunta reflexion
    // En Java, para evitar un NullPointerException, se utilizaria una verificacion de null antes de acceder a la longitud de un String.
    // Tomando en cuenta el mismo ejemplo en Java seria:
    // if (texto != null) {
    //     System.out.println("Longitud del texto: " + texto.length());
    // } else {
    //     System.out.println("El texto es null");
    // }

    // Logica condicional con when
    val diaNumero: Int = 3 // Este valor puede ir variando
    val diaSemana = when (diaNumero) {
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miercoles"
        4 -> "Jueves"
        5 -> "Viernes"
        6 -> "Sabado"
        7 -> "Domingo"
        else -> "Numero no valido para dia de la semana"
    }
    println("El dia correspondiente es: $diaSemana")
}

// Preguntas de reflexion
// Que diferencias y similitudes clave observaste entre Kotlin y Java en esta actividad?
// Ambos lenguajes nos permiten declarar variables de manera similar. Y como diferencia podria decir que la sintaxis de Kotlin es mas simple y concisa.
// Como podrias aplicar lo aprendido sobre la seguridad ante nulos (Null Safety) y la expresion when en futuros proyectos de desarrollo de aplicaciones moviles?
// En Kotlin, la seguridad ante nulos se maneja de manera mas concisa, lo que puede ayudar a reducir errores. La expresion when tambien proporciona una forma mas clara y legible de manejar multiples condiciones en comparacion con las estructuras de control tradicionales.