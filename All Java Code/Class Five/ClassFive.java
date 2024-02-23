
package clay.classfive;
import java.util.*;

public class ClassFive {
    static Scanner input ;

    public static void main(String[] args) {
        //User Input obj
        input = new Scanner (System.in);
        System.out.println("          Sourov IT LTD.");
        System.out.println("    Contact us :- 01300156566");
        System.out.println("      Welcome to our company");
        System.out.println("Please help with your information.");
        
        //Data input
        System.out.println("What's Your Name:");
        String name=input.nextLine();
        System.out.println("Father's Name:");
        String Fname=input.nextLine();
        System.out.println("Mother's Name:");
        String Mname=input.nextLine();
        System.out.println("Your Roll:");
        int roll=input.nextInt();
        System.out.println("Registration number:");
        int reg=input.nextInt();
        System.out.println("Your Marks Please:");
        int mark=input.nextInt();
        System.out.println("And CGPA:");
        Double gpa=input.nextDouble();
        System.out.println("Phonr No for contact:");
        int phone=input.nextInt();
        System.out.println("And Last Enter Your Address:");
        String address=input.nextLine();
        System.out.println("Thank you for the information.");
        
        // Data Set
        ClassFiveA data=new ClassFiveA();
        data.setName(name);
        data.setFname(Fname);
        data.setMname(Mname);
        data.setRoll(roll);
        data.setReg(reg);
        data.setMark(mark);
        data.setGpa(gpa);
        data.setPhone(phone);
        data.setAddress(address);
        
        //Data Output
        System.out.println("");
        System.out.println("");
        System.out.println("Check your information");
        System.out.println("Name:"+data.getName());
        System.out.println("Father's Name:"+data.getFname());
        System.out.println("Mother's Name:"+data.getMname());
        System.out.println("Roll No:"+data.getRoll());
        System.out.println("Registration number:"+data.getReg());
        System.out.println("Mark:"+data.getMark());
        System.out.println("CGPA:"+data.getGpa());
        System.out.println("Phone No:"+data.getPhone());
        System.out.println("Address:"+data.getAddress());
        System.out.println("That's it");
    }
}
