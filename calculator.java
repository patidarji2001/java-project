/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codetech.it;

/**
 *
 * @author RAVI
 */
import java.util.*;
public class calculator {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        boolean b=true;
        while(b){
            System.out.println("Calcualtor");
        System.out.println("1.Addition");
        System.out.println("2.substraction");
        System.out.println("3.multiplication");
        System.out.println("4.division");
        System.out.print("Enter choices - ");
        int ch=s.nextInt();
        System.out.print("Enter first value - ");
        double p=s.nextInt();
        System.out.print("Enter second value - ");
        double q=s.nextInt();
        switch(ch){
            case 1: System.out.println(p+q);
                break;
            case 2: System.out.println(p-q);
                break;
            case 3: System.out.println(p*q);
                break;
            case 4: System.out.println(p/q);
                break;
            default: System.out.println("invalid selection");
                
        }
        System.out.print("Enter continue or close - ");
         b=s.nextBoolean();
        }
        
        
    }
}
