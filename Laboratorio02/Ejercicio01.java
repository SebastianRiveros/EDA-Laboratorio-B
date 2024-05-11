import java.util.*;

public class Ejercicio01 {
    //Metodo para invertir el arreglo
    public static int[] invertirArray(int[] a){
        int[] x = new int[a.length];
        for(int i = 0, j = a.length-1; i < a.length; i++, j--){ 
            x[i] = a[j]; //Se agrega a los primeros elementos del nuevo arreglo los valores de los ultimos elementos del arreglo inicial
        }
        return x;
    }
    //Metodo para imprimir los elementos de un arreglo
    public static void mostrar(int[] arreglo){
        for(int x : arreglo){
            System.out.print(x + " ");
        }
    }
    //Metodo para 
    public static void main(String[] args){
        //Arreglo de numeros aleatorios
        int[] arreglo = {(int)(Math.random()*10+1),(int)(Math.random()*10+1),(int)(Math.random()*10+1),(int)(Math.random()*10+1),(int)(Math.random()*10+1)};
        System.out.println("Arreglo inicial:");
        mostrar(arreglo);
        System.out.print("\n");
        System.out.println("Arreglo invertido:");
        mostrar(invertirArray(arreglo)); //Se invierte y muestra el arreglo
    }
}

