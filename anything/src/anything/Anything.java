/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package anything;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Anything {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        //prompt user to enter string
        System.out.println("Enter a String to check for a digit: ");
        String word = obj.nextLine();
        
        //call a method that validates a string for a digit
        CheckForDigit check = new CheckForDigit();
        System.out.println("String has a digit?;" + check.DigitMethod(word));
        
    }//end of method
    public static class CheckForDigit{
        //example
        //input = Other14
        public boolean DigitMethod(String input){
           for(int i = 0; i < input.length(); i++){
               if(Character.isDigit(input.charAt(i))){
                   return true;
               }//end of is statement
           }//end of for loop
           return false;
               //to get the length of something use the length method
               //in programming when we start counting;we start from 0 but we count the length normally.
             
        }//end of digit method
    }//end of CheckForDigit class
    
}

