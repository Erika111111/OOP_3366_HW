package Task3;
// класс Cube имплементирует интерфейсы iShapeArea, iShapeVolume
public class Cube implements iShapeArea, iShapeVolume{
    private int edge;
    public Cube(int edge) {
    this.edge = edge;  
}
// переопределение метода volume
    @Override
    public double volume() {
        return edge * edge * edge;
    }
// переопределение метода area
    @Override
    public double area() {
        return 6 * edge * edge;
    }

}
