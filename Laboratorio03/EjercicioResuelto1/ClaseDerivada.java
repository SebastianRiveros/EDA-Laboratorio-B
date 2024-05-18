class ClaseDerivada extends ClaseBase {
        private int valor3;
        private int valor4;
        public ClaseDerivada(int valor3, int valor4) {
        this.valor3 = valor3;
        this.valor4 = valor4;
    }
    public void unMetodoClaseDerivada() {
        int rpta = valor3 + valor4 + valor1 + valor2;
        System.out.println("Ingreso a Metodo de Clase Derivada y la suma de 2 valores y la respuesta es: " +
        rpta);
    }
}