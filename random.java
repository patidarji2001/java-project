package codetech.it;

import java.util.ArrayList;
import java.util.Scanner;

public class random {
        static Scanner s = new Scanner(System.in);
    static int randomnumber = (int) (Math.random() * 100 + 1);
   static  int guess=10;
        static ArrayList<Integer> pg = new ArrayList<>();
        static int count=1;
    public static void main(String[] args) {
        
//        System.out.println(randomnumber);
        
       newgame();
        
    }
    public static void validate(int guess){
        if(guess<0){
          System.out.println("Invalid guess ");   
        }
        else{
            if(guess>100){
              System.out.println("Invalid guess ");  
            }
            else{
                pg.add(guess);
                if(count==11){
                   display(guess);
                  System.out.println("end game random number is  "+randomnumber);
                  endgame();
                }
                else{
                    display(guess);
                    checkguess(guess);
                }
                
            }
        }
    }
    public static void display(int guess){
        System.out.println(" your numbers :-"+pg);
        count++;
        
    }
    public static void checkguess(int guess){
        if(guess==randomnumber){
          System.out.println("you guessed it right ");
          endgame();
        }
        else{
            if(guess<randomnumber){
             System.out.println("number is low ");     
            }
            else
            {
             if(guess>randomnumber){
               System.out.println("number is high ");   
            }   
            }
        }
    }
    public static void newgame(){
        randomnumber = (int) (Math.random() * 100 + 1); 
         while(count<=guess){
         System.out.println(" enter number from 1 to 100 ");
          int ui=s.nextInt();
          validate(ui);
         
        }
         System.out.println("do you want to continue 1/0 ");
      int ch=s.nextInt();
      if(ch==1){
         newgame();  
      }
    }
    public static void endgame(){
      pg.clear();
      count=1;
      
   
    }
}
