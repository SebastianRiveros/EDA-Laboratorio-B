public class Main {
    public static void main(String[] args) {
        ABB<Integer> abb = new ABB<>();

        //insertar valores en el ABB
        abb.insertar(50);
        abb.insertar(30);
        abb.insertar(70);
        abb.insertar(20);
        abb.insertar(40);
        abb.insertar(60);
        abb.insertar(80);

        //recorridos
        System.out.print("InOrden: ---> ");
        abb.inOrden();
        System.out.print("PreOrden: ---> ");
        abb.preOrden();
        System.out.print("PostOrden: ---> ");
        abb.postOrden();

        // Buscar un valor
        Nodo<Integer> nodoBuscado = abb.buscar(40);
        System.out.println("Buscar 40: " + (nodoBuscado != null));

        //Encontrar el mínimo y máximo
        System.out.println("Minimo: " + abb.minimo());
        System.out.println("Maximo: " + abb.maximo());

        //Encontrar predecesor y sucesor
        System.out.println("Predecesor de 40: " + abb.predecesor(40));
        System.out.println("Sucesor de 40: " + abb.sucesor(40));

        //Eliminar un valor
        abb.eliminar(20);
        System.out.print("InOrden despues de eliminar 20: ");
        abb.inOrden();
    }
}
