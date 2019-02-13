/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mark.analyser;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class MarkAnalyser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
       System.out.println("Enter average of your marks (less than 100)::");
      int average = input.nextInt();
      char grade;

      if(average>=75){
         grade = 'A';
      }else if(average>=60 && average<75){
         grade = 'B';
      }
      else if(average>=40 && average<60){
         grade = 'C';
      }
      else if (average>=0 && average<40) {
         grade = 'D';
      }
      else {
        grade = 'e';
      }

       switch(grade) {
         case 'A' :
            System.out.println("Excellent!");
            break;
         case 'B' :
         case 'C' :
            System.out.println("Well done");
            break;
         case 'D' :
            System.out.println("failed");
         
            break;
         default :
         System.out.println("invalid grade");
      }
      System.out.println("Your grade is " + grade);
         }
}