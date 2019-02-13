/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la03.pkg2;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class La032 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int x = in.nextInt();
        System.out.print("Input second number: ");
        int y = in.nextInt();
        System.out.print("Input third number: ");
        int z = in.nextInt();

        if (x == y && x == z)
        {
            System.out.println("All numbers are equal");
        }
        else if ((x == y) || (x == z) || (z == y))
        {
            System.out.println("Neither all are equal or different");
        }
        else
        {
            System.out.println("All numbers are different");
        }
    }

    }
    

