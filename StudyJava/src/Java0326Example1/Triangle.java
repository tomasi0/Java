package Java0326Example1;

public class Triangle implements Shape{
    private double lenght;

    private double width;

    public Triangle(){
    }

    public Triangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }
    @Override
    public double calculateArea() {
        return lenght * lenght * 0.5;
    }

    @Override
    public double calculatePerimeter() {
        return 3*lenght;
    }
}
