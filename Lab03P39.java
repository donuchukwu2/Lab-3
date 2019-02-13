/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03.p3.pkg9;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Lab03P39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
     String water = "";
     System.out.print("Enter a temperature: ");
     Double degrees = in.nextDouble();
     System.out.println("");
     System.out.print("Enter a 'C' for Celsius or 'F' for Fahrenheit: ");
     String tempType = in.next();
     System.out.println("");
     System.out.print("Enter the altitude in meters.");
     Double altitude = in.nextDouble();
     Double boilingPoint = altitude % 300;
     
     if(tempType.equals("f")){
       degrees = (degrees - 32.0) * 5.0 / 9.0;
     }
     degrees = degrees + boilingPoint;
     if(degrees >= 100){
       water = "gaseous";
     }else if(degrees > 0){
       water = "liquid";
     }else if(degrees <= 0){
       water = "solid";
     }
     System.out.printf("Wow, really? The water must be %s%n",water);
   }

}
 
