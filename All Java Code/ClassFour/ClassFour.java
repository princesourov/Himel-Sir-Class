package clay.classfour;
//Model Class


public class ClassFour {

    public static void main(String[] args) {
        //constractor Call
        ClassFourA data =new ClassFourA();
        data.roll=611867;
        data.phone=01300;
        data.gpa=3.50;
        data.mark=95;
        data.address="kurigram"; 
        
        //constractor print
        System.out.println("Your Roll:-"+data.roll);
        System.out.println("Your Phone Number:-"+data.phone);
        System.out.println("Your Mark:-"+data.mark);
        System.out.println("Your CGPA is :-"+data.gpa);
        System.out.println("Your Address:-"+data.address);
        
        System.out.println("           ");
        
        
        // get set call-
        ClassFourB data2 = new ClassFourB();
        data2.setRoll(611867);
        data2.setPhone(4669661);
        data2.setMark(55);
        data2.setGpa(3.50);
        data2.setAddress("kurigram");
        
        //get set print
        System.out.println("Your Roll:-"+data2.getRoll());
        System.out.println("Your Phone Number:-"+data2.getPhone());
        System.out.println("Your Mark:-"+data2.getMark());
        System.out.println("Your CGPA is :-"+data2.getGpa());
        System.out.println("Your Address:-"+data2.getAddress());
        
        
    }
}
