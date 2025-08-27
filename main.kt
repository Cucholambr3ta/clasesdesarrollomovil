//fun main(){
    var a:Int =1
    val b:Int =2
    var c:String? = null

    a=a+b
    println("el valor de a es: $a")
    println("el valor de b es: $b")
    println("el valor de c es: $c")

//}

//la variable en kotlin puede estar vacia
var a: String? = "Hello"
a=null // permitido

//acceso seguro (no lanza error)
val lengthSafe = a?.length // devuelve null si 'a' es null

//acceso forzado
val lengthForced = a!!.length // lanza NullPointerException si 'a' es null

fun main() {
    // Declaración de variables numéricas
    var numero1: Int = 10
    val numero2: Int = 5

    // Operaciones matemáticas simples
    val suma = numero1 + numero2
    val resta = numero1 - numero2
    val multiplicacion = numero1 * numero2

    // Mostrar resultados en consola
    println("Suma: $suma")
    println("Resta: $resta")
    println("Multiplicación: $multiplicacion")
}