package Day1;

public class Student2 {
   private int roll;
   private String name;
   private String address;
   private String collegeName;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

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

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public Student2(int roll, String name, String address) {
        setName(name);
        setAddress(address);
        setRoll(roll);
        setCollegeName("NIT");
    }

    public Student2(int roll,String name, String address, String collegeName){
        setCollegeName(collegeName);
        setRoll(roll);
        setName(name);
        setAddress(address);
    }
    public static Student2 getStudent(boolean isFromNIT){
        if(isFromNIT == true) {
            //Student s1 = new Student(21,"Sam","Mumbai");
            return new Student2(21,"Sam","Mumbai");
            //System.out.println(Student.);

        }
        else
            return new Student2(63,"Pragati","Kanpur","IIT");

    }

    public  Student2(){

    }
}
