/* ¿Cuáles serán los valores de las variables a y b después de cada línea del siguiente algoritmo?

Algo ValoresDeLasVariables
variable a, b: entero
Inicio
a <- 3
escribir("a = " & a)
b<-a+5
escribir("a = " & a & " y b = " & b)
a<-7
escribir("a = " & a & " y b = " & b)
Fin */


class Algoritmo1{
    public static void main(String[] args){
        int a, b;
        a = 3;
        System.out.println("a = " + a); //a = 3
        b = a + 5;
        System.out.println("a = " + a + " y b = " + b); //a = 3 y b = 8
        a = 7;
        System.out.println("a = " + a + " y b = " + b); //a = 7 y b = 8
    }
}
