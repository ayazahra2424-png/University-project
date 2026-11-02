
package edu.zuj.oop.week3.lactuer2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
         System.out.println("Enter numbers of iteme : ");
         int n=s.nextInt();
         int a2[]=new int[n]; 
         for(int i=0;i<a2.length;i++){
             
         System.out.println("Enter value "+(i+1)+" : ");  
            a2[i]=s.nextInt();
              
             
         }
         
         int sum=0;
         for(int i=0;i<a2.length;i++){
           sum+=a2[i];  
           
         }
         System.out.println("=============");
         System.out.println("sum = " +sum);
         for(int i=0;i<a2.length;i++){
            System.out.println(a2[i]);   
             
         }
         System.out.println("=============");
         
         
         
         
    }
}
