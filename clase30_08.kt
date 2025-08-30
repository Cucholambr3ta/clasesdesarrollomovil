// una clase es una "plantilla" en simples palabras
// se utiliza para crear o instanciar objetos
// se define una clase utilizando la palabra clave "class"

// encapsulamiento es el proceso de ocultar los detalles
//internos de una clase y exponer solo lo necesario

// herencia es el mecanismo que permite crear una nueva clase
// a partir de una clase existente, heredando sus atributos y métodos

// polimorfismo es la capacidad de un objeto de tomar muchas formas
// es decir, que una misma operación puede comportarse de diferentes maneras

// ejemplos de clases, encapsulamiento, herencia y polimorfismo en kotlin

// Clase
class Persona{
    var nombre: String = ""
    var edad: Int = 0
    constructor(name: String = "", age: Int = 0) {
        this.nombre = name
        this.edad = age
    }
}
fun main() {
    val una=Persona()
    una.nombre = "Juan Pablo"
    una.edad = 20
    var dos=Persona()
    dos.nombre = "Esteban"
    dos.edad = 25
    var tres+Trabajador("Emmanuel Andres", 28)
    
    println("Nombre: ${una.nombre}, Edad: ${una.edad}")
    println(dos.nombre)
    println(dos.edad)
}

open class Persona(private var nombre:String="", private var edad:Int=0){

    fun saludar(): String{
        return "Hola, me llamo $nombre y mi edad es $edad años."
    }

}

fun main() {
    val una=Persona("Juan Pablo",20)
    var dos=Persona("Esteban",25)

    println(una.saludar())
    println(dos.saludar())
}

class Trabajador(nombre: String, edad: Int, private var altura: Double = 0.0): Persona(nombre, edad){
    fun elsaludito(): String {
        return "Hola, mi nomnbre es $nombre, tengo $edad años y mido $altura metros."
    }

}fun main() {
    val una=Persona("Juan Pablo",20)
    var dos=Persona("Esteban",25)
    var tres=Trabajador("Emanuel Andres",28,1.8)

    println(una.saludar())
    println(dos.saludar())
    println(tres.elsaludito())
}


sealed class ResultadoBusqueda
data class Encontrado(val pokemon: Pokemon) : ResultadoBusqueda()
data class NoEncontrado(val mensaje: String) : ResultadoBusqueda()
object Buscando : ResultadoBusqueda()

fun manejarBusqueda(resultado: ResultadoBusqueda) {
    when (resultado) {
        is Encontrado -> println("Pokémon encontrado: ${resultado.pokemon.nombre}")
        is NoEncontrado -> println("Búsqueda fallida: ${resultado.mensaje}")
        Buscando -> println("Buscando Pokémon...")
    }
}
//ejemplo de uso:
fun principal() {
    val pikachu = Pokemon(id=25, nombre="Pikachu", tipo="Eléctrico")
    manejarBusqueda(resultado = Buscando)
    manejarBusqueda(resultado = Encontrado(pokemon = pikachu))
    manejarBusqueda(resultado = NoEncontrado(mensaje = "No hay coincidencias"))
}