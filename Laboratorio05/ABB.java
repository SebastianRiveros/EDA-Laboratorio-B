// ABB.java
public class ABB<T extends Comparable<T>> {
    private Nodo<T> raiz;

    public ABB() {
        this.raiz = null;
    }

    // insertar un valor en el árbol
    public void insertar(T valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo<T> insertarRecursivo(Nodo<T> nodo, T valor) {
        if (nodo == null) {
            return new Nodo<>(valor);
        }
        if (valor.compareTo(nodo.getDato()) < 0) {
            nodo.setIzquierda(insertarRecursivo(nodo.getIzquierda(), valor));
        } else if (valor.compareTo(nodo.getDato()) > 0) {
            nodo.setDerecha(insertarRecursivo(nodo.getDerecha(), valor));
        }
        return nodo;
    }

    // buscar un valor en el árbol
    public Nodo<T> buscar(T valor) {
        return buscarRecursivo(raiz, valor);
    }

    private Nodo<T> buscarRecursivo(Nodo<T> nodo, T valor) {
        if (nodo == null || nodo.getDato().equals(valor)) {
            return nodo;
        }
        if (valor.compareTo(nodo.getDato()) < 0) {
            return buscarRecursivo(nodo.getIzquierda(), valor);
        } else {
            return buscarRecursivo(nodo.getDerecha(), valor);
        }
    }

    // encontrar el valor mínimo
    public T minimo() {
        Nodo<T> nodo = minimoRecursivo(raiz);
        return nodo != null ? nodo.getDato() : null;
    }

    private Nodo<T> minimoRecursivo(Nodo<T> nodo) {
        if (nodo == null || nodo.getIzquierda() == null) {
            return nodo;
        }
        return minimoRecursivo(nodo.getIzquierda());
    }

    // encontrar el valor máximo
    public T maximo() {
        Nodo<T> nodo = maximoRecursivo(raiz);
        return nodo != null ? nodo.getDato() : null;
    }

    private Nodo<T> maximoRecursivo(Nodo<T> nodo) {
        if (nodo == null || nodo.getDerecha() == null) {
            return nodo;
        }
        return maximoRecursivo(nodo.getDerecha());
    }

    // encontrar el predecesor de un valor
    public T predecesor(T valor) {
        Nodo<T> actual = buscar(valor);
        if (actual == null) {
            return null;
        }
        if (actual.getIzquierda() != null) {
            return maximoRecursivo(actual.getIzquierda()).getDato();
        }

        Nodo<T> predecesor = null;
        Nodo<T> ancestro = raiz;
        while (ancestro != actual) {
            if (valor.compareTo(ancestro.getDato()) > 0) {
                predecesor = ancestro;
                ancestro = ancestro.getDerecha();
            } else {
                ancestro = ancestro.getIzquierda();
            }
        }
        return predecesor != null ? predecesor.getDato() : null;
    }


}