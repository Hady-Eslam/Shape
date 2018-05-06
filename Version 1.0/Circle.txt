package myproject;
public class Circle  extends Shape{
    double redius;
    String Laws="The Perimeter Of Circle Is = 2*redius*pi\nThe Area Of Circle Is = redius*redius*pi\n";
    public Circle(double redius)
    {
        this.redius=redius;
    }
    public double getPerimeter()
    {
        return Math.round((Math.round(Math.PI*10000)/10000.0)*2*redius*10000)/10000.0;
    }
    public double getArea()
    {
        return Math.round((Math.round(Math.PI*10000)/10000.0)*redius*redius*10000)/10000.0;
    }
    public String toString()
    {
        return Laws;
    }
    
}
