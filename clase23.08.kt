public class MiClase {
    //definicion de un metodo
    public int suma (int a, int b){
        int resultado = a+b;
        return resultado;
    }
    //metodo principal donde se puede llamar al metodo "suma"
public static void main (String[] args){    
    MiClase objeto = new MiClase();
    int resultado = objeto.suma(5, 3);
    System.out.println("El resultado es: " + resultado);
    }
}

    //ciclo for
    for (i in 1..10){
        println(i)
    }
    //ciclo while
    var i = 1
    while (i <= 10) {
        println(i)
        i++
    }
    //ciclo do while
    var i=1
    do {
        println(i); i++
    } while (i <= 10)

//funcion con sintaxis tradicional
fun sum(a: Int, b: Int): Int{
    return a+b
}

fun main (){
    var c: Int =0
    var x: Int = 5
    var y: Int =3
    c = sum(x,y)
    println(c)
}
//funcion de una sola expresion
fun suma(a: Int, b: Int) = a+b

//Funcion de orden superior
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

//Lambda o funcion anonima
val sum = {a: Int, b: Int -> a + b}

