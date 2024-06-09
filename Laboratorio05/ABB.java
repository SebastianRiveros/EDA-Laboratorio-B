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


}