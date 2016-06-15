package main;

/**
 *
 * @author Vinicio
 */
public class Edge {

    private Vertex start = null, end = null;
    private boolean type;
    private int length, bandWidth;

    public Edge(int length, int bandWidth, Vertex start, Vertex end) {
        this.length = length;
        this.bandWidth = bandWidth;
        this.start = start;
        this.end = end;
    }

    public Vertex getStart() {
        return start;
    }

    public void setStart(Vertex start) {
        this.start = start;
    }

    public Vertex getEnd() {
        return end;
    }

    public void setEnd(Vertex end) {
        this.end = end;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBandWidth() {
        return bandWidth;
    }

    public void setBandWidth(int bandWidth) {
        this.bandWidth = bandWidth;
    }

    @Override
    public String toString() {
        return start + ":" + end + ":" + length + ":" + bandWidth;
    }
}
