
package javaapplication3;

public class shape {
    protected String color;
    protected boolean filled;
    public shape(){
        color = "red";
        filled= true;
    }
    public shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public String getColor(){
        return color;
    } 
    public void setColor(String color){
        this.color=color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    public String toString(){
        return("shape[color="+this.getColor()+",filled="+this.isFilled()+"]");
    }
}

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

public class Rectangle extends shape{
    protected double width,length;
    public Rectangle(){
        width=length=1.0;
    }
    public Rectangle (double width , double length){
        this.width=width;
        this.length=length;  
    }
    public Rectangle (double width,double length,String color,boolean filled){
        this.width=width;
        this.length=length;
        this.color=color;
        this.filled=filled;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
        public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*(width+length);
    }
    @Override
    public String toString(){
        return("Rectangle[color="+this.getColor()+",filled="+this.isFilled()+
              ",width="+this.getWidth()+",length="+this.getLength()+
                "area="+this.getArea()+",perimeter"+this.getPerimeter()+"]");
    }  
    
}
public class Square extends Rectangle{
    private double side;
    public Square(){
        width=length;
    }
    public Square(double side){
        this.side=side;
    }
    public Square(double side,String color,boolean filled){
        this.side=side;
        this.color=color;
        this.filled=filled;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side=side;
    }
    @Override
    public void setWidth(double width){
        this.width=width;
    }
    @Override
    public void setLength(double length){
        this.length=length;
    }
    
    @Override
    public String toString(){
        return("Square[color="+this.getColor()+",filled="+this.isFilled()+
              ",width="+this.getWidth()+",length="+this.getLength()+
                "area="+this.getArea()+",perimeter"+this.getPerimeter()+"]");
    } 
}

