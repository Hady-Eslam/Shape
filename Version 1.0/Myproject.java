package myproject;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Myproject {
    public static void main(String[] args) 
    { 
        Scanner in=new Scanner(System.in);
        for (;;)
        {
            System.out.println("Enter 1 For Information And Exersices About Circle\nEnter 2 For Information And Exersices About Rectangle");
            System.out.println("Enter 3 For Information And Exersices About Triangle\nEnter 4 For Information And Exersices About Cube");
            System.out.println("Enter 5 For Information And Exersices About Cylinder\nEnter 0 For Exit the programe");
            int s,co1=0;
            try
            {
                s=in.nextInt();
                if (s==0)
                    co1=1;
                else if (s==1)
                    circle();
                else if (s==2)
                    rectangle();
                else if (s==3)
                    triangle();
                else if (s==4)
                    cube();
                else if (s==5)
                    cylinder();
                else
                    System.out.println("This number is error please enter a value from 0 to 5\n\n");
            }
            catch (InputMismatchException e)
            {
                System.out.println("The Input is error please enter an intger number from 0 to 5\n\n");
                in.nextLine();
            }
            if (co1==1)
                break;
        }
 
    }
    
    static void circle()
    {
        Scanner in=new Scanner(System.in);
        Circle c=new Circle(Math.random()*10);
        System.out.println(c.toString());
        System.out.println("The Time For Exersices\n");
        
        // this for loop for Exersices
        for (;;)
        {
            double redius=Math.round( (Math.random()*10)*10000)/10000.0;
            Circle f=new Circle(redius);
            System.out.println("You have redius of cirlec = "+f.redius);
            System.out.println("calculate the perimeter first and area\nAnd enter them with 4 digit after the point with proximity");
            System.out.println("With Knowing That pi = 3.1416");
            double perimeter=0,area=0;
            
            // this for loop for compresions 
            for (;;)
            {
                // this for loop for try and catch
                int co=0;
                for (;;)
                {
                    try
                    {
                        System.out.print("The Perimeter = ");
                        perimeter=in.nextDouble();
                        System.out.print("\nThe Area = ");
                        area=in.nextDouble();
                        System.out.println();
                        co=1;
                    }
                    catch(InputMismatchException e)
                    {
                        System.out.println("The Input Should be A number");
                        in.nextLine();
                    }
                    if (co==1)
                        break;
                }
                if (perimeter<0||area<0)
                    break;
                if (perimeter==f.getPerimeter()&&area==f.getArea())
                    System.out.println("True");
                else if (perimeter!=f.getPerimeter()&&area!=f.getArea())
                    System.out.println("False,The perimeter and area is False,Try again");
                else if (perimeter!=f.getPerimeter()&&area==f.getArea())
                    System.out.println("False , The perimeter is False ,Try again");
                else 
                    System.out.println("False , The Area is False ,Try again");
                if (perimeter==f.getPerimeter()&&area==f.getArea())
                    break;
                System.out.println("Enter the perimeter and area again");
            }
            if (perimeter<0||area<0)
                    break;
            System.out.println("Another Exercise");
        }
    }    
    
    static void rectangle()
    {
        Scanner in=new Scanner(System.in);
        Rectangle r=new Rectangle(Math.random()*10,Math.random()*10);
        System.out.println(r.toString());
        System.out.println("The Time For Exersices\n");
        for (;;)
        {
            double wiegth=Math.round((Math.random()*10)*10000)/10000.0;
            double length=Math.round((Math.random()*10)*10000)/10000.0;
            Rectangle f=new Rectangle(wiegth,length);
            System.out.println("You have wiegth of Rectangle = "+f.wieght);
            System.out.println("You have length of Rectangle = "+f.length);
            System.out.println("calculate the perimeter first and area\nAnd enter them with 4 digit after point with proximity");
            double perimeter=0,area=0;
            for (;;)
            {
                int co=0;
                for (;;)
                {
                    try
                    {
                        System.out.print("The Perimeter = ");
                        perimeter=in.nextDouble();
                        System.out.print("\nThe Area = ");
                        area=in.nextDouble();
                        System.out.println();
                        co=1;
                    }
                    catch(InputMismatchException e)
                    {
                        System.out.println("The Input Should be A number");
                        in.nextLine();
                    }
                    if (co==1)
                        break;
                }
                if (perimeter<0||area<0)
                    break;
                if (perimeter==f.getPerimeter()&&area==f.getArea())
                    System.out.println("True");
                else if (perimeter!=f.getPerimeter()&&area!=f.getArea())
                    System.out.println("False,The perimeter and area is False,Try again");
                else if (perimeter!=f.getPerimeter()&&area==f.getArea())
                    System.out.println("False , The perimeter is False ,Try again");
                else 
                    System.out.println("False , The Area is False ,Try again");
                if (perimeter==f.getPerimeter()&&area==f.getArea())
                    break;
                System.out.println("Enter the perimeter and area Again");
            }
            if (perimeter<0||area<0)
                    break;
            System.out.println("Another Exercise");
        }
    }
    
    static void triangle()
    {
        Scanner in=new Scanner(System.in);
        Triangle t=new Triangle(Math.random()*10,Math.random()*10,Math.random()*10);
        System.out.println(t.toString());
        System.out.println("The Time For Exersices\n");
        for (;;)
        {
            double side1=Math.round((Math.random()*10)*10000)/10000.0;
            double side2=Math.round((Math.random()*10)*10000)/10000.0;
            double side3=Math.round((Math.random()*10)*10000)/10000.0; 
            Triangle f=new Triangle(side1,side2,side3);
            System.out.println("You have trree sides of Triangle = "+f.side1+"  , "+f.side2+"  , "+f.side3);
            System.out.println("calculate the perimeter first and area\nAnd enter them with 4 digit after point with proximity");
            double perimeter=0,area=0;
            for (;;)
            {
                int co=0;
                for (;;)
                {
                    try
                    {
                        System.out.print("The Perimeter = ");
                        perimeter=in.nextDouble();
                        System.out.print("\nThe Area = ");
                        area=in.nextDouble();
                        System.out.println();
                        co=1;
                    }
                    catch(InputMismatchException e)
                    {
                        System.out.println("The Input Should be A number");
                        in.nextLine();
                    }
                    if (co==1)
                        break;
                }
                if (perimeter<0||area<0)
                    break;
                if (perimeter==f.getPerimeter()&&area==f.getArea())
                    System.out.println("True");
                else if (perimeter!=f.getPerimeter()&&area!=f.getArea())
                    System.out.println("False,The perimeter and area is False,Try again");
                else if (perimeter!=f.getPerimeter()&&area==f.getArea())
                    System.out.println("False , The perimeter is False ,Try again");
                else 
                    System.out.println("False , The Area is False ,Try again");
                if (perimeter==f.getPerimeter()&&area==f.getArea())
                    break;
                System.out.println("Enter the perimeter and area again");
            }
            if (perimeter<0||area<0)
                    break;
            System.out.println("Another Exercise");
        }
    }
    
    static void cube()
    {
        Scanner in=new Scanner(System.in);
        Cube c=new Cube(Math.random()*10);
        System.out.println(c.toString());
        System.out.println("The Time For Exersices\n");
        for (;;)
        {
            double length=Math.round((Math.random()*10)*10000)/10000.0;
            Cube f=new Cube(length);
            System.out.println("You have length of cube = "+f.length);
            System.out.println("calculate the perimeter first and area and volume\nAnd enter them with 4 digit after point with proximity");
            double perimeter=0,area=0,volume=0;
            for (;;)
            {
                int co=0;
                for (;;)
                {
                    try
                    {
                        System.out.print("The Perimeter = ");
                        perimeter=in.nextDouble();
                        System.out.print("\nThe Area = ");
                        area=in.nextDouble();
                        System.out.print("\nThe Volume = ");
                        volume=in.nextDouble();
                        System.out.println();
                        co=1;
                    }
                    catch(InputMismatchException e)
                    {
                        System.out.println("The Input Should be A number");
                        in.nextLine();
                    }
                    if (co==1)
                        break;
                }
                if (perimeter<0||area<0||volume<0)
                    break;
                if (perimeter==f.getPerimeter()&&area==f.getArea()&&f.getVolume()==volume)
                    System.out.println("True");
                else if (perimeter==f.getPerimeter()&&area==f.getArea()&&volume!=f.getVolume())
                    System.out.println("False , volume is False,Try again");
                else if (perimeter==f.getPerimeter()&&area!=f.getArea()&&volume==f.getVolume())
                    System.out.println("False , The area is False ,Try again");
                else if (perimeter==f.getPerimeter()&&area!=f.getArea()&&volume!=f.getVolume())
                    System.out.println("False , The area and volume is False,Try again");
                else if (perimeter!=f.getPerimeter()&&area==f.getArea()&&volume==f.getVolume())
                    System.out.println("False , The perimeter is False,Try again");
                else if (perimeter!=f.getPerimeter()&&area==f.getArea()&&volume!=f.getVolume())
                    System.out.println("False , The perimeter and volume is False,Try again");
                else if (perimeter!=f.getPerimeter()&&area!=f.getArea()&&volume==f.getVolume())
                    System.out.println("False , The perimeter and area is False,Try again");
                else 
                    System.out.println("False , The perimeter and area and volume is False ,Try again");
                if (perimeter==f.getPerimeter()&&area==f.getArea()&&f.getVolume()==volume)
                    break;
                System.out.println("Enter the perimeter and area and volume again");
            }
            if (perimeter<0||area<0||volume<0)
                    break;
            System.out.println("Another Exercise");
        }
    }
    
    static void cylinder()
    {
        Scanner in=new Scanner(System.in);
        Cylinder c=new Cylinder(Math.random()*10,Math.random()*10);
        System.out.println(c.toString());
        System.out.println("The Time For Exersices\n");
        for (;;)
        {
            double redius=Math.round((Math.random()*10)*10000)/10000.0;
            double height=Math.round((Math.random()*10)*10000)/10000.0;
            Cylinder f=new Cylinder(redius,height);
            System.out.println("You have redius of cylinder = "+f.redius);
            System.out.println("You have hieght of cylinder = "+f.hieght);
            System.out.println("calculate the perimeter first and area and volume\nAnd enter them with 4 digit after point with proximity");
            System.out.println("With Knowing That the pi = 3.1416");
            double perimeter=0,area=0,volume=0;
            for (;;)
            {
                int co=0;
                for (;;)
                {
                    try
                    {
                        System.out.print("The Perimeter = ");
                        perimeter=in.nextDouble();
                        System.out.print("\nThe Area = ");
                        area=in.nextDouble();
                        System.out.print("\nThe Volume = ");
                        volume=in.nextDouble();
                        System.out.println();
                        co=1;
                    }
                    catch(InputMismatchException e)
                    {
                        System.out.println("The Input Should be A number");
                        in.nextLine();
                    }
                    if (co==1)
                        break;
                }
                if (perimeter<0||area<0||volume<0)
                    break;
                if (perimeter==f.getPerimeter()&&area==f.getArea()&&f.getVolume()==volume)
                    System.out.println("True");
                else if (perimeter==f.getPerimeter()&&area==f.getArea()&&volume!=f.getVolume())
                    System.out.println("False , volume is False,Try again");
                else if (perimeter==f.getPerimeter()&&area!=f.getArea()&&volume==f.getVolume())
                    System.out.println("False , The area is False ,Try again");
                else if (perimeter==f.getPerimeter()&&area!=f.getArea()&&volume!=f.getVolume())
                    System.out.println("False , The area and volume is False,Try again");
                else if (perimeter!=f.getPerimeter()&&area==f.getArea()&&volume==f.getVolume())
                    System.out.println("False , The perimeter is False,Try again");
                else if (perimeter!=f.getPerimeter()&&area==f.getArea()&&volume!=f.getVolume())
                    System.out.println("False , The perimeter and volume is False,Try again");
                else if (perimeter!=f.getPerimeter()&&area!=f.getArea()&&volume==f.getVolume())
                    System.out.println("False , The perimeter and area is False,Try again");
                else 
                    System.out.println("False , The perimeter and area and volume is False ,Try again");
                if (perimeter==f.getPerimeter()&&area==f.getArea()&&f.getVolume()==volume)
                    break;
                System.out.println("Enter The perimeter and area and volume again");
            }
            if (perimeter<0||area<0||volume<0)
                    break;
            System.out.println("Another Exercise");
        }
    }
}
    
    
