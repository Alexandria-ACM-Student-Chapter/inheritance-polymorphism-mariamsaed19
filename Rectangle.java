
package javaapplication5;

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