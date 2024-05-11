import java.util.*;

public class Ejercicio03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base del triangulo:");
        int base = sc.nextInt();
        System.out.println(trianguloRecursivo(base));
    }

    public static String trianguloRecursivo(int base){
        if(base < 1) //Si la base llega a ser 0 se detiene la recursion
            return "";
        String x = "";
        for(int i = 0; i < base; i++){
            x += "*"; //Se Agrega al String una fila de * segun el numero de la base actual
        }
        return trianguloRecursivo(base-1) + "\n" + x; //Se retorna la el metodo con la base disminuida en 1 y el String modificado
    }
}
