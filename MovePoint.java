
package javaapplication4;

public class MovePoint implements Movable{
    int x , y ,xspeed,yspeed;
    public MovePoint (int x,int y,int xspeed,int yspeed){
        this.x=x;
        this.y=y;
        this.xspeed=xspeed;
        this.yspeed=yspeed;
    }

    MovePoint() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String toString(){
        return ("MovePoint[x="+x+",y="+y+",xspeed="
                +xspeed+",yspeed="+yspeed+"]");
    }
    @Override
    public void moveUp(){
        y-=yspeed;
    }
    @Override
    public void moveRight(){
        x+=xspeed;
    }
    @Override
    public void moveDown(){
        y+=yspeed;
    }
    @Override
    public void moveLeft(){
        x-=xspeed;
    }
}