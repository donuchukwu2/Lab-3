/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03.p3.pkg2;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Lab03P32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        double n = in.nextDouble();

        if (n > 0)
        {
            if (n < 1)
            {
                System.out.println("Positive small");
            }
            else if (n > 1000000)
            {
                System.out.println("Positive large");
            }
            else
            {
                System.out.println("Positive");
            }
        }
        else if (n < 0)
        {
            if (Math.abs(n) < 1)
            {
                System.out.println("Negative small");
            }
            else if (Math.abs(n) > 1000000)
            {
                System.out.println("Negative large");
            }
            else
            {
                System.out.println("Negative");
            }
        }
        else
        {
            System.out.println("Zero");
        }
    }
}
    
    
