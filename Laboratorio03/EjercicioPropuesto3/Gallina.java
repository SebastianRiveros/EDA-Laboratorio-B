class Gallina extends Ave {
    public Gallina(String nombre, int edad, double envergadura, double peso, String color) {
        super(nombre, edad, envergadura, peso, color);
    }

    @Override
    public void hacerSonido() {
        System.out.println("¡Cot!");
    }
}