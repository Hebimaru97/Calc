/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import java.util.*;

/**
 *
 * @author Grafton
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Additon/Subtraction Calculator, please use doubles."); 
        JavaApplication1 myJava = new JavaApplication1();

        Scanner scan = new Scanner(System.in);
        System.out.println("Use \"q\" to quit");
        String choice = "";
        while (!choice.equals("q")){
            System.out.println("Would you like to Add (+) or Sub (-)\nEnter + or -");
            choice = scan.next();

            double num1 = 0.0, num2 = 0.0;

            if (choice.equals("+")){
                try{
                    System.out.println("Enter a number:");
                    num1 = scan.nextDouble();
                    System.out.println("Enter a number:");
                    num2 = scan.nextDouble();
                }catch (Exception e){
                    System.err.println("Invalid Input");
                    
                }
                
                double addition = myJava.add(num1, num2);
                System.out.println(addition);
                
                
            }
            else if(choice.equals("-")){
                System.out.println("Enter a number:");
                num1 = scan.nextDouble();
                System.out.println("Enter a number:");
                num2 = scan.nextDouble();
                double sub = myJava.sub(num1, num2);
                System.out.println(sub);
            }
            else if(choice.equals("q")){
                //System.exit(0);
            }
            else{
                System.out.println("Invalid Input");
            }
        
        }
      
        
    }
    
    /**
     * This method adds two numbers
     * @param number1
     * @param number2
     * @return 
     */
    public double add(double number1, double number2){
    
        double answer;
        try{
            answer = number1 + number2;
        }catch(Exception e){
            System.err.print("Invalid Input");
            answer = 0.0;
        }
        return answer;
    }
    
    public double sub(double number1, double number2){
        
        double answer = number1 - number2;
        
        return answer;
    }
    
}
