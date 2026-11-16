
package edu.zuj.week5.lactuer2oop;


public class Circle {
   private  int rad;

    public Circle() {
    }

    public Circle(int rad) {
        this.rad = rad;
    }
    public static final double pi=22/7;
    public void calcArea(){
       double area=pi*rad*rad;
        System.out.println("area : "+area);
        
    }
    public void calcRound(){
        double round=2*pi*rad;
        System.out.println("Round"+round);
    }

    public void setRad(int rad) {
        if(rad>0){
        this.rad = rad;
       
        }else{
            System.out.println("Invalid rad"+rad);
        }
    }

    public int getRad() {
        return rad;
    }

  
    
}
