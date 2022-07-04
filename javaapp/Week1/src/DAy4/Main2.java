package Day1;

public class Main2 {

    public static void main(String[] args) {
        Student2 s1 =  Student2.getStudent(false);
        System.out.println("Name " + s1.getName());
        System.out.println("Roll " + s1.getRoll());
        System.out.println("Address " + s1.getAddress());
        System.out.println("College " + s1.getCollegeName());


        System.out.println("********************");

        Student2 s2 =  Student2.getStudent(true);
        System.out.println("Name " + s2.getName());
        System.out.println("Roll " + s2.getRoll());
        System.out.println("Address " + s2.getAddress());
        System.out.println("College " + s2.getCollegeName());
    }
}
