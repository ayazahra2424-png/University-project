
package edu.zuj.oop.week2.ladtuer1;

import java.util.Scanner;

public class Tast4 {
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
      System.out.println("Enter the three number ");
      double n1=s.nextDouble();
     double n2=s.nextDouble();
     double n3=s.nextDouble();
     double sum= n1+n2+n3;
      double avg=(sum)/3.0;
     System.out.println("sum="+sum);
      System.out.println("average="+avg);
      
}
}