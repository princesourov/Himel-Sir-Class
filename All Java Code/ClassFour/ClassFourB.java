
package clay.classfour;

public class ClassFourB {
    // get set
    private int roll,mark,phone;
    private double gpa;
    private String address;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        if(mark<50){
            System.out.println("Mark Not Accepted Under 50. That means you Faild");
        }
        else{
        this.mark = mark;
            System.out.println("You Passed");
        }
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
       
}
