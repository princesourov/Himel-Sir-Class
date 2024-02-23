
package clay.classfive;

public class ClassFiveA {
    private String name,address,Fname,Mname;
    private int phone,mark,roll,reg;
    private Double gpa;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getMname() {
        return Mname;
    }

    public void setMname(String Mname) {
        this.Mname = Mname;
    }
    

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getMark(){
        return mark;
    }

    public void setMark(int mark) {
        if(mark<40){
            System.out.println("Mark Not Accepted Under 40, That means you rejected.");
        }
        else{
        this.mark = mark;
            System.out.println("Your marks are enough to apply.");
        }
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getReg() {
        return reg;
    }

    public void setReg(int reg) {
        this.reg = reg;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        if(gpa<3.00){
            System.out.println("CGPA Not Accepted Under 3.00, That means you rejected.");
        }
        else if (gpa>4.01){
        System.out.println("Wrong CGPA.");
            System.out.println("Please retype your correct CGPA.");
        }
        else{
        this.gpa = gpa;
            System.out.println("Your CGPA are enough to apply.");
        }
    }
    
    
}
