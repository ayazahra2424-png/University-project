
package edu.zuj.week5.lactuer1.oop;


public class carTest {
    public static void main(String[] args) {
     car c1=new car();
     c1.type="Mercedes";
     c1.year=2010;
     c1.turnOn();
     c1.moveBackword();
     c1.stop();
     c1.turnOf();
        System.out.println("=================");
     car c2=new car();
     c2.type="toyota";
     c2.year=2016;
     c2.turnOn();
     c2.moveBackword();
     c2.stop();
     c2.turnOf();
        System.out.println("==================");
    }
}
