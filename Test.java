/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.test;

/**
 *
 * @author almadkhal14
 */
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        int a,b;
        char op;
         Scanner r=new Scanner(System.in);
        
        System.out.println("enter operator");
        op=r.next().charAt(0);
        
        System.out.println("enter first no");
        a=r.nextInt();
        
        System.out.println("enter second no");
        b=r.nextInt();

       
          Calc clc=new Calc();
         switch (op)
         {
             case '+':
              
               System.out.println(clc.Sum(a, b));
                break;
             case '-':
                System.out.println(clc.Substract(a, b));
                break;             
             case '*':
               System.out.println(clc.Multipl(a, b));
                break;
             case '/':
                  if(b==0){
                     System.out.println("over flow");
                     
                     break; 
                 }
                System.out.println(clc.Division(a, b));
                break;            
             case '%':
                   if(b==0){
                     System.out.println("over flow");
                     
                     break; 
                 }
                System.out.println(clc.Modi(a, b));
                break;
             default:
              System.out.println("Not operator");
        }
        
                }
}
