/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

public class MovableCircle implements Movable{
    private int radius;
    private MovePoint center = new MovePoint();
    public MovableCircle(int x, int y ,int xspeed , int yspeed , int radius){
        center.x=x;
        center.y=y;
        center.xspeed=xspeed;
        center.yspeed=yspeed;
        this.radius=radius;
    }
    public String toString(){
        return ("MovePoint[x="+center.x+",y="+center.y+",xspeed="
                +center.xspeed+",yspeed="+center.yspeed+",radius="+radius+"]");
    }
        @Override
    public void moveUp(){
       center.y-=center.yspeed;
    }
    @Override
    public void moveRight(){
        center.x+=center.xspeed;
    }
    @Override
    public void moveDown(){
        center.y+=center.yspeed;
    }
    @Override
    public void moveLeft(){
        center.x-=center.xspeed;
    }
   
}

