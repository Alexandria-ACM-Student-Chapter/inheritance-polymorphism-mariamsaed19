
package javaapplication5;

public class Circle extends shape {
    private double radius ;
    public Circle(){
        radius=1.0;
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled){
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return radius*2*Math.PI;
    }
    @Override
    public String toString(){
        return("Circle[color="+this.getColor()+",filled="+this.isFilled()+
              ",radius"+this.getRadius()+"area="+this.getArea()+",perimeter"
                +this.getPerimeter()+"]");
    }        
}
