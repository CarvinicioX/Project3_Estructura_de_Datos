package main;

/**
 *
 * @author Vinicio
 */
public class Vertex {
    
    private String name = "", type = "";
    public Edge[] adjacencies;
    public double minDistance = Double.POSITIVE_INFINITY;
    public Vertex previous;

    public Vertex(String Name, String Type) {
        this.name = Name;
        this.type = Type;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getType() {
        return type;
    }

    public void setType(String Type) {
        this.type = Type;
    }
    
    public int compareTo(Vertex other){
        return Double.compare(minDistance, other.minDistance);
    }

    @Override
    public String toString() {
        return name + "." + type;
    }
}
