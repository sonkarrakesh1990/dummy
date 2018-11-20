/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;

/**
 *
 * @author SONY
 */
public class Calculator  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {  
      Scanner in=new Scanner(System.in);
      String answer;
      
        
    System.out.println("enter choice to perform Arithmatic operation");
     System.out.println("1 for add");
      System.out.println("2 for sub");
           
    System.out.println("Enter your choice");
   
      int choice=in.nextInt();
     
      switch(choice)
      {
          case 1:
          {
              System.out.println("Enter the value of A");
              int a=in.nextInt();
                      System.out.println("Enter the value of B");
                      int b=in.nextInt();
                              int c=a+b;
                              System.out.println("Result is "+c);
                              
                              
              }
          case 2:
          {
              System.out.println("Enter the value of A");
              int a=in.nextInt();
                      System.out.println("Enter the value of B");
                      int b=in.nextInt();
                              int c=a-b;
                              System.out.println("Result is "+c);
                        
                             
           }
          
        
      
    
      }
 
      }
    }
       
       
        
       
        
        