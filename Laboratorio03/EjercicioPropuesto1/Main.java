public class Main {
    public static void main(String[] args){
        //Se crean 3 alumnos
        Persona p1 = new Alumno();
        Persona p2 = new Alumno();

        p1.setNombre("Sebastian");
        p1.setEdad(19);

        p2.setNombre("Leonardo");
        p2.setEdad(18);

        System.out.println("Nombre del estudiante: "+p1.getNombre()+"\nEdad: "+p1.getEdad());
        System.out.println("Nombre del estudiante: "+p2.getNombre()+"\nEdad: "+p2.getEdad());
    }
}