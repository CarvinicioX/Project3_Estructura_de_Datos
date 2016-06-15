package main;

/**
 *
 * @author Vinicio
 */
public class Vertex {

    private String name = "", type = "";

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

    @Override
    public String toString() {
        return name + "." + type;
    }
}
