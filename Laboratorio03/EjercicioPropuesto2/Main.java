// Clase principal para probar la implementación
public class Main {
    public static void main(String[] args) {
        Objeto mesa = new Objeto("mesa", new Color(0,0,0),new Material("Madera"));
        Objeto silla = new Objeto("silla", new Color(255,255,255),new Material("Metal"));
        Objeto piso = new Objeto("piso", new Color(0,255,255), new Material("Marmol"));

        mesa.imprimir();
        silla.imprimir();
        piso.imprimir();
    }
}
