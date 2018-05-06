package myproject;
public class Cube extends Shape{
    double length;
    String Laws="The Perimeter Of Cube Is = 12*length\nThe Area Of Cube Is = 6*length*length\nThe Volume Of Cube Is = length*length*length\n";
    public Cube(double length)
    {
        this.length=length;
    }
    
    public double getPerimeter()
    {
        return Math.round(12*length*10000)/10000.0;
    }
    
    public double getArea()
    {
        return Math.round(6*length*length*10000)/10000.0;
    }
    
    public double getVolume()
    {
        return Math.round(length*length*length*10000)/10000.0;
    }
    
    public String toString()
    {
        return Laws;
    }    
}
