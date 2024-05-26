public class Main {
    public static void main(String[] args) {
        //Calculadora de enteros        
        Calculadora<Integer> c1 = new Calculadora<>();
        System.out.println("Suma : " + c1.sumar(5, 3));
        System.out.println("Resta : " + c1.restar(5, 3));
        System.out.println("Multiplicación : " + c1.multiplicar(5, 3));
        System.out.println("División : " + c1.dividir(6, 3));

        //Calculadora float's
        Calculadora<Float> c2 = new Calculadora<>();
        System.out.println("Suma : " + c2.sumar(5.5f, 3.2f));
        System.out.println("Resta : " + c2.restar(5.5f, 3.2f));
        System.out.println("Multiplicación : " + c2.multiplicar(5.5f, 3.2f));
        System.out.println("División : " + c2.dividir(5.5f, 3.2f));

        //Prueba con una calculadora de datos diferentes
        Calculadora<Double> c3 = new Calculadora<>();
        System.out.println("Suma : " + c3.sumar(5.5, 3.2));
    }
}
