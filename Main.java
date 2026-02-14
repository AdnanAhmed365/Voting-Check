import java.util.Scanner;
 public class VotingCheck {
     public static void main(String[] args){
         Scanner Adnan =new Scanner(System.in);
         System.out.println("Enter the age:");
         int age= Adnan.nextInt();
         if (age<18){
             System.out.println("you are not eligable for voting");

         }
         else{
             System.out.println("you are eligable for voting");

         }
     }


 }
