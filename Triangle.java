public class Triangle {
    private double edge_1 ;
    private double edge_2;
    private double edge_3;

    public Triangle(double edge_1, double edge_2, double edge_3) {
        this.edge_1 = edge_1;
        this.edge_2 = edge_2;
        this.edge_3 = edge_3;
    }

    public Triangle() {
    }

    public double getEdge_1() {
        return edge_1;
    }

    public void setEdge_1(double edge_1) {
        this.edge_1 = edge_1;
    }

    public double getEdge_2() {
        return edge_2;
    }

    public void setEdge_2(double edge_2) {
        this.edge_2 = edge_2;
    }

    public double getEdge_3() {
        return edge_3;
    }

    public void setEdge_3(double edge_3) {
        this.edge_3 = edge_3;
    }
}
