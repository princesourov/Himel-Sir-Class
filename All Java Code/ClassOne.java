
package clay.classone;
import java.util.*;

public class ClassOne {

    public static void main(String[] args) {
        
        //input System
        Scanner input =new Scanner(System.in);
        System.out.println("Enter Youer first number");
        int number = input.nextInt();
        
        // print system
        System.out.println("number:-"+number);
        
         // morethen three condition
         // if.........if else......else
         if(number<10){
         int a=number+1;
         System.out.println(a);
         }
         else if(number<20){
         int a=number+10;
         System.out.println(a);
         }
         else if(number<50){
         int a=number+50;
                 System.out.println(a);
         }
         else{
             int a= number+100;
             System.out.println(a);
         }   
         
         //switch
         char a= 'a';
         switch (a){
             case 'a':
                 System.out.println("Vowel");
                 break;
             case 'e':
                 System.out.println("Vowel");
                 break;
             case 'i':
                 System.out.println("Vowel");
                 break;
             case 'o':
                 System.out.println("vowel");
                 break;
             case 'u':
                 System.out.println("Vowel");
                 break;
            default:
                System.out.println("Not Vowel");
                break;
         }
         
         
    }
}
