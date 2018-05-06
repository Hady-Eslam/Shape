package myproject;
public class Cylinder extends Shape{
    double redius,hieght;
    String Laws="The Perimeter Of Cylinder Is = 4*PI*redius*hieght\nThe Area Of Cylinder Is = 2*PI*redius*(hieght+redius)\nThe Volume Of Cylinder Is = PI*redius*redius*hieght\n";
    public Cylinder (double redius,double hieght)
    {
        this.redius=redius;
        this.hieght=hieght;
    }
    
    public double getPerimeter()
    {
        return Math.round( 4*Math.round(Math.PI*10000)/10000.0*redius*hieght*10000)/10000.0;
    }
    
    public double getArea()
    {
        return Math.round( 2*Math.round(Math.PI*10000)/10000.0*redius*(hieght+redius)*10000)/10000.0;
    }
    
    public double getVolume()
    {
        return Math.round( Math.round(Math.PI*10000)/10000.0*redius*redius*hieght*10000)/10000.0;
    }
    
    public String toString()
    {
        return Laws;
    }
}
