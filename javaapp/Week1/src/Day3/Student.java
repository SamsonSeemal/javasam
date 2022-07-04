package Day3;

public class Student {
    int roll;
    String name;
    int marks;

    void displayStudentDetails(int roll, String name, int marks ){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        System.out.println("Roll " + roll);
        System.out.println("Name " + name);
        System.out.println("MArks " + marks);
        System.out.println("-------------------------------------------------");

    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.displayStudentDetails(186, "Samson" , 750);
        s2.displayStudentDetails(210, "XYZ" , 890);

        s1 = null;
        s2 = null;

    }
}
