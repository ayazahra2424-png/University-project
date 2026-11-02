
package homewoek;

import java.util.Scanner;


public class Homewoek {

    
    public static void main(String[] args) {
         Scanner s= new Scanner(System.in);
         System.out.println("Enter n1: ");
         double n1=s.nextDouble();
         System.out.println("1- convert from CM to a  Inche ");
         System.out.println("2- convert from Inche to CM ");
         System.out.println("3- convert form M to Feet ");
         System.out.println("4- convert form Dunm to Hiktar ");
         System.out.println("5- convert from Hiktar to Dunm");
         System.out.println("7- convert from Cels to Fenh");
         System.out.println(" 8- convert from Fenh to Cels");
        
         System.out.println("Enter your choice: ");
         int ch=s.nextInt();
         switch(ch){
            case 1: System.out.println("result =" + (n1/2.54));break;
            case 2: System.out.println("result =" + (n1*2.54));break;
            case 3: System.out.println("result =" + (n1*3.28084));break;
            case 4: System.out.println("result =" + (n1/10));break;
            case 5: System.out.println("result =" + (n1*10));break; 
            case 6: System.out.println("result =" + (n1*1.8));break; 
            case 7: System.out.println("result =" + ((n1*1.8)+32));break;
            case 8: System.out.println("result =" + ((n1-1.32)/1.8));break; 
            default:System.out.println("Invalid choies"); 
            
        }
        
    }
    
}
