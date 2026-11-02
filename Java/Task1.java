
package edu.zuj.week1.lactuer1;

import java.util.Scanner;



public class Task1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n1 : ");
        int n1=s.nextInt();
        System.out.println("Enter n2 :");
        int n2=s.nextInt();
        if(n1>n2){
            System.out.println(n1+ "bigger than " +n2);
    } else if(n2>n1){
            System.out.println(n2+ "bigger than " +n1);
    }
        else
            System.out.println(n1+ " and " +n2+ " equal ");
        
        
        
        
    }
}
