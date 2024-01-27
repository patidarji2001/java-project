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
class game{
    static char[][] ch;
    game(){
        ch=new char[3][3];
        init();
    }
//    System.out.println("-------------");
    public void init(){
        for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
         ch[i][j]=' '; 
          }
      }
    }
    public static void display(){
            System.out.println("-------------");
        for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
         System.out.print("| "+ch[i][j]+" ");
          }
      System.out.println("|");
      System.out.println("-------------");
      }
    }
    
    public static void insert(int row,int col,char c){
        if(row>=0 && row<3 && col>=0 && col<3){
        ch[row][col]=c;
        }
        else{
            System.out.println("invalid details");
        }
    }
    public static boolean checkcol(){
        for(int j=0;j<=2;j++){
            if(ch[0][j]!=' ' && ch[0][j]==ch[1][j] && ch[0][j]==ch[2][j]){
                return true;
            }
        }
            return false;
  }
    public static boolean checkrow(){
        for(int j=0;j<=2;j++){
            if(ch[j][0]!=' ' && ch[j][0]==ch[j][1] && ch[j][1]==ch[j][2]){
                return true;
            }
        }
            return false;
  }
    public static boolean checkdia(){
       
            if( ch[0][0]!=' ' && ch[0][0]==ch[1][1] && ch[1][1]==ch[2][2]||
                    ch[0][2]!=' ' && ch[0][2]==ch[1][1] && ch[1][1]==ch[2][0]){
                return true;
            }
        
            return false;
  }
    public static boolean checkdraw(){
            
        for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
     if(ch[i][j]==' '){
     return false;
         }
          }
      
      }
        return true;
    }
    
}
public class tictactoe {
    public static void main(String args[]){
        game g=new game();
        humanplayer p1=new humanplayer("bob",'x');
        AIplayer p2=new AIplayer("com",'o');
        Player cp;
        cp=p1;
        while(true){
            System.out.println(cp.name+" goes first");
            cp.makemove();
            game.display();
            if(game.checkcol() || game.checkdia() || game.checkrow()){
                System.out.println(cp.name+" has won ");
                break;
            }
            else if(game.checkdraw()){
                System.out.println(" Game Draw ");
                break;
            }
            else{
                if(cp==p1){
                    cp=p2;
                }
                else
                {
                    cp=p1;
                }
            }
        }
    }
}

 abstract class Player{
     String name;
    char mark;
    abstract void makemove();
    
     public boolean isvalid(int row,int col){
        if(row>=0 && row<3 && col>=0 && col<3 &&
                game.ch[row][col]==' ')return true;
        return false;
    }
 }
class humanplayer extends Player{
    
    humanplayer(String name,char mark){
        this.name=name;
        this.mark=mark;
    }
    public void makemove(){
        Scanner st=new Scanner(System.in);
        int row;
        int col;
        do{
          System.out.print(" enter row and col : ");
          row=st.nextInt();
          col=st.nextInt();
        }while(!isvalid(row,col));
        game.insert(row, col, mark);
    }
    
   
}
class AIplayer extends Player{
   
    AIplayer(String name,char mark){
        this.name=name;
        this.mark=mark;
    }
    public void makemove(){
       
        int row;
        int col;
        do{
          System.out.print(" enter row and col : ");
          Random r=new Random();
          row=r.nextInt(3);
          col=r.nextInt(3);
        }while(!isvalid(row,col));
        game.insert(row, col, mark);
    }
    
   
}
