package myproject;
public class Rectangle extends Shape{
    double wieght,length;
    String Laws="The Perimeter Of Rectangle Is = (wieght+length)*2\nThe Area Of Rectangle Is = (wieght*length)\n";
    public Rectangle(double wieght,double length)
    {
        this.wieght=wieght;
        this.length=length;
    }
    
    public double getPerimeter()
    {
        return Math.round((wieght+length)*2*10000)/10000.0;
    }
    
    public double getArea()
    {
        return Math.round((wieght*length)*10000)/10000.0;
    }
    
    public String toString()
    {
        return Laws;
    }
}
