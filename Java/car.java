
package edu.zuj.week5.lactuer1.oop;


public class car {
    String type;
    int year;
    
    public void turnOn(){
        System.out.println("turning on car : "+ type +" with model "+year);
    }
    public void turnOf(){
        System.out.println("turninr of car :"+ type + " with model "+ year);
    }
    public void moveForward(){
        System.out.println("move car : "+type+" with model "+ year +"Foeward");
             
    }
    public void moveBackword(){ 
        System.out.println("movw car :"+type+" with model "+year+" Backword");   
     
    }
    public void stop(){
        System.out.println("stoping car : "+type+" with model "+year);
       
    }
}
