class ClaseBase {
    protected int valor1 = 10;
    protected int valor2 = 12;
    public ClaseBase() {
    }

    public void unMetodoClaseBase() {
        int rpta = valor1 + valor2;
        System.out.println("Ingreso a Metodo de Clase Base y realizó la suma; la respuesta es: " + rpta);
    }
}