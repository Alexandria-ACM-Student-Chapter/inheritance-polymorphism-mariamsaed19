
package javaapplication5;
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