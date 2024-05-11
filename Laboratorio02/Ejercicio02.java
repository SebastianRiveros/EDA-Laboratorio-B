import java.util.*;

public class Ejercicio02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de rotacion");
        int d = sc.nextInt();
        int[] a = {(int)(Math.random()*10+1),(int)(Math.random()*10+1),(int)(Math.random()*10+1),(int)(Math.random()*10+1),(int)(Math.random()*10+1)};
        System.out.println("Arreglo inicial:");
        mostrar(a); //Se muestra el arreglo original
        System.out.print("\n"); //Salto de linea
        System.out.println("Arreglo rotado:");
        mostrar(rotarIzquierdaArray(a, d)); //Se muestra el arreglo rotado
    }

    //Metodo para rotar el arreglo
    public static int[] rotarIzquierdaArray(int[] a, int d){
        int[] x = new int[a.length];
        for(int i = 0; i < a.length; i++){
            //Se asignan los valores del nuevo arreglo con orden modificado del primero
            x[i] = a[(i + d) % a.length];  
        }
        return x;
    }

    //Imprime los elementos del arreglo a travez de un bucle for-each
    public static void mostrar(int[] a){
        for(int x : a){
            System.out.print(x + " ");
        }
    }
}
