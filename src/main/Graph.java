package main;

/**
 *
 * @author Vinicio
 */
public class Graph {

    private Vertex[] Nodes = null;
    private Edge[] Edges = null;

    public Graph() {
        Nodes = new Vertex[1];
        Nodes[0] = new Vertex("Togo", "Conexión Dedicada");
        Edges = new Edge[0];
    }

    @Override
    public String toString() {
        String tmp = "";
        for (Vertex Node : Nodes) {
            tmp += Node;
        }
        for (Edge Edge : Edges) {
            tmp += Edge;
        }
        return tmp;
    }

    public void addNode(Vertex node) {
        Vertex[] tmp = this.Nodes;
        this.Nodes = new Vertex[tmp.length + 1];
        for (int i = 0; i < tmp.length; i++) {
            this.Nodes[i] = tmp[i];
        }
        this.Nodes[this.Nodes.length - 1] = node;
        for (Vertex Node : this.Nodes) {
            System.out.println(Node);
        }
    }

    public void addEdge(Edge Edge) {
        Edge[] tmp = this.Edges;
        this.Edges = new Edge[tmp.length + 1];
        for (int i = 0; i < tmp.length; i++) {
            this.Edges[i] = tmp[i];
        }
        this.Edges[this.Edges.length - 1] = Edge;
        for (Edge Edge1 : this.Edges) {
            System.out.println(Edge1);
        }
    }

    public Vertex[] getVertex() {
        return this.Nodes;
    }

    public Edge[] getEdge() {
        return this.Edges;
    }
}
