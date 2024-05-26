public class Main {
    
    // Funciona para todos los tipos de datos
    public static <T extends Comparable<T>> T maximo(T x, T y) {
        return (x.compareTo(y) > 0) ? x : y;
    }

    public static void main(String[] args) {
        System.out.println(maximo(3, 7));
        System.out.println(maximo(3.0, 7.0));
        System.out.println(maximo('g', 'e'));
    }
}