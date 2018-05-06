package myproject;
public class Triangle extends Shape{
    double side1,side2,side3;
    String Laws="The Perimeter Of Triangle Is = side1+side2+side3\nThe Area Of Triangle Is = sqrt( (perimeter/2)*(perimeter/2-side1)*(perimeter/2-side2)*(perimeter/2-side3) ) \n";
    public Triangle (double side1,double side2,double side3)
    {
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    
    public double getPerimeter()
    {
        return Math.round((side1+side2+side3)*10000)/10000.0;
    }
    
    public double getArea()
    {
        return Math.round(Math.sqrt( ((side1+side2+side3)/2.0 ) * (((side1+side2+side3)/2.0)-side1) * (((side1+side2+side3)/2.0)-side2) * (((side1+side2+side3)/2.0)-side3) ) * 10000)/10000.0;
    }
    
    public String toString()
    {
        return Laws;
    }
    
}
