
// clase genérica Turista
class Turista<T> {
    private String nombre;
    private T dni;  //dni con la posibilidad de se un numeo o una cadena  
    private String nacionalidad;

    // Constructor
    public Turista(String nombre, T dni, String nacionalidad) {
        this.nombre = nombre;
        this.dni = dni;
        this.nacionalidad = nacionalidad;
    }

    // metodo para obtener los datos del turista
    public void obtenerDatos() {
        System.out.println("\nRegistro de turista:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Documento de Identidad: " + dni);
        System.out.println("Nacionalidad: " + nacionalidad);
    }
}