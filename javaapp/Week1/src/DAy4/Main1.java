package Day1;

public class Main1 {

    public static void main(String[] args) {

        Student1 s1 = new Student1();
        s1.setName("Samson");
        s1.setAge(21);
        s1.setMarks(450);
        s1.setRoll(186);

        System.out.println("Name is " + s1.getName());
        System.out.println("Roll Is " + s1.getRoll());
        System.out.println("Age is " + s1.getAge());
        System.out.println("Marks is " + s1.getMarks());

        System.out.println("*******************************************");

        Student1 s2 = new Student1(63, "Tiwari" , 23, 400);
        System.out.println("Name is " + s2.getName());
        System.out.println("Roll Is " + s2.getRoll());
        System.out.println("Age is " + s2.getAge());
        System.out.println("Marks is " + s2.getMarks());


    }
}
