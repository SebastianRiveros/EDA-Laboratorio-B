//Clase generica cuyo variable de tipo T se restringe a la ser de la clase Number.
public class Calculadora<T extends Number> {
    public T sumar(T a, T b) {
        //Se verifica que ambos argumentos sean enteros
        if (a instanceof Integer && b instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        } 
        //Se verifica que ambos argumentos sean float
        else if (a instanceof Float && b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() + b.floatValue());
        } else {
            //Si ambos argumentos no son float o enteros, se lanza la exepcion
            throw new IllegalArgumentException("Tipo no soportado para la suma.");
        }
    }

    public T restar(T a, T b) {
        //Se verifica que ambos argumentos sean enteros
        if (a instanceof Integer && b instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() - b.intValue());
        } 
        //Se verifica que ambos argumentos sean float
        else if (a instanceof Float && b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() - b.floatValue());
        } else {
            //Si ambos argumentos no son float o enteros, se lanza la exepcion
            throw new IllegalArgumentException("Tipo no soportado para la resta.");
        }
    }

    public T multiplicar(T a, T b) {
        //Se verifica que ambos argumentos sean enteros
        if (a instanceof Integer && b instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() * b.intValue());
        } 
        //Se verifica que ambos argumentos sean float
        else if (a instanceof Float && b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() * b.floatValue());
        } else {
            //Si ambos argumentos no son float o enteros, se lanza la exepcion
            throw new IllegalArgumentException("Tipo no soportado para la multiplicación.");
        }
    }

    public T dividir(T a, T b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("División por cero.");
        }
        //Se verifica que ambos argumentos sean enteros
        if (a instanceof Integer && b instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() / b.intValue());
        }
        //Se verifica que ambos argumentos sean float
        else if (a instanceof Float && b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() / b.floatValue());
        } else {
            //Si ambos argumentos no son float o enteros, se lanza la exepcion
            throw new IllegalArgumentException("Tipo no soportado para la división.");
        }
    }
}