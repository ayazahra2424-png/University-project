
package edu.zuj.week1.lactuer1;

import java.util.Scanner;


public class tempconverter {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter temp in cals");
        int c=s.nextInt();
        double f=(c*1.8)+32;
        System.out.println("temp in fenh = " +f);  
     }
}
