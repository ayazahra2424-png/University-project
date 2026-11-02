
package edu.zuj.oop.week3.lactuer2;

import java.util.Scanner;



public class Task5array {
    public static void main(String[] args) {
     
        double arr[]=new double[30];
        System.out.println("===========");
          fillArray(arr); 
        System.out.println("===========");
          printArray(arr);
        }
    public static void fillArray(double arr[])
        {
          Scanner s=new Scanner(System.in);
          System.out.println("Enter reads 30 numbers  : "); 
          for(int i=0;i<arr.length;i++){  
            System.out.println("arr["+i+"] :");   
            arr[i]=s.nextDouble();
       }  
          }      
    public static void printArray(double arr[])
    {
         double largest=arr[0];
         double secondlargest=arr[0];
    
            if (arr[1]>arr[0]){
            largest=arr[1];
              secondlargest=arr[0];
        }   else{ 
            largest=arr[0];
              secondlargest=arr[1];
            for(int i=2;i<arr.length;i++){ 
            if(arr[i]>largest){
                double secondlarges = largest;
                largest=arr[i]; 
            } else if(arr[i]> secondlargest && arr[i]!=largest ){  
                  secondlargest=arr[i];
            
            } 
                        }
            }
              System.out.println("the laegest number is :"+ largest);
                System.out.println("the second largest number is: "+secondlargest);
          }  
               
   
     

        
}
