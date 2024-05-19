class Ave {
    //Atributos
    String nombre;
    int edad;
    double envergadura;
    double peso;
    String color;

    //Constructor
    public Ave(String nombre, int edad, double envergadura, double peso, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.envergadura = envergadura;
        this.peso = peso;
        this.color = color;
    }

    //Metodos
    public void volar() {
        System.out.println(nombre+" de color "+color+", envergadura "+envergadura+", peso "+peso+" y color "+color+" está volando.");
    }

    //Metodo
    public void hacerSonido() {
    }
}