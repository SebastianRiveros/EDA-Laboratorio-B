import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class RegistroDeAduanas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Turista<?>> turistas = new ArrayList<>();
        String continuar = "si";
        // Solicitar al usuario que ingrese los datos de los turistas
        while (continuar.equals("si")) {
            System.out.println("Nombre:");
            String nombre = sc.nextLine();
            System.out.println("DNI:");
            String documentoIdentidad = sc.nextLine();
            System.out.println("Nacionalidad:");
            String nacionalidad = sc.nextLine();

            // Crear una instancia de Turista con generacidad y agregarla a la lista
            Turista<?> turista = new Turista<>(nombre, documentoIdentidad, nacionalidad);
            turistas.add(turista);
            System.out.println("Desea agregar un turista mas? (Escriba 'si' si es el caso)");
            continuar = sc.nextLine();
        }

        // Mostrar los datos de todos los turistas almacenados en la lista
        System.out.println("\nDatos de los turistas registrados:");
        for (Turista<?> turista : turistas) {
            turista.obtenerDatos();
        }
        sc.close();
    }
}
