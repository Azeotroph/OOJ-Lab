import java.util.Scanner;

abstract class shape{
    int a,b;
    shape(int x, int y){
        a=x;
        b=y;
    }
    shape(int x){
        a=x;
    }
    public void printArea(){
    }
}

class Rectangle extends shape{
    Rectangle(int x,int y){
        super(x,y);
    }
    public void printArea(){
        System.out.println("The area of Rectangle is: "+(b*a));
    }
}

class Triangle extends shape{
    Triangle(int x,int y){
        super(x,y);
    }
    public void printArea(){
        System.out.println("The area of Triangle is: "+(b*a*0.5));
    }
}

class Circle extends shape{
    Circle(int x){
        super(x);
    }
    public void printArea(){
        System.out.println("The area of Circle is: "+(a*a*3.14));
    }
}
public class exp4 {
    public static void main(String args[]){
        Triangle t1=new Triangle(30, 40);
        Rectangle r1=new Rectangle(40, 50);
        Circle c1=new Circle(10);
        t1.printArea();
        r1.printArea();
        c1.printArea();
    }
}