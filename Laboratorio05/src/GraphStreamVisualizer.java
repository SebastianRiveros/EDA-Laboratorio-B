import org.graphstream.graph.Graph;
import org.graphstream.graph.Node; // Importa la clase Node de GraphStream
import org.graphstream.graph.implementations.SingleGraph;

public class GraphStreamVisualizer<T extends Comparable<T>> {
    private Graph graph;

    public GraphStreamVisualizer() {
        graph = new SingleGraph("ABB");
    }

    public void visualizar(ABB<T> abb) {
        graph.clear();
        Node rootNode = graph.addNode("root"); // Usa la clase Node de GraphStream
        rootNode.setAttribute("ui.label", "root");
        visualizarRecursivo(abb.getRaiz(), rootNode); // Pasa el nodo raíz como argumento
        graph.display();
    }
    
    private void visualizarRecursivo(Nodo<T> nodo, Node parentNode) { // Cambia el tipo de parámetro a Node
        if (nodo != null) {
            String nodeId = nodo.getDato().toString();
            Node currentNode = graph.addNode(nodeId); // Crea el nodo en el grafo
            graph.addEdge(parentNode.getId() + "-" + nodeId, parentNode, currentNode); // Añade la arista
            currentNode.setAttribute("ui.label", nodeId); // Establece la etiqueta del nodo
            visualizarRecursivo(nodo.getIzquierda(), currentNode); // Visualiza el subárbol izquierdo
            visualizarRecursivo(nodo.getDerecha(), currentNode); // Visualiza el subárbol derecho
        }
    }
}
