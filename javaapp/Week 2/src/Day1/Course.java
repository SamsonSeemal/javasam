package Day2;
import java.util.Scanner;
public class Course {
    int courseID;
    String courseNAme;
    int courseFess;

    void displayCourseDetails(){
        System.out.println("Course Name: " + courseNAme);
        System.out.println("Course Id: " + courseID);
        System.out.println("Course Fess: " + courseFess);
    }

    static void authenticate(String userName, String password){
        if(userName == "Admin" && password == "1234")
        {
            Course c1 = new Course();

            Scanner s1 = new Scanner(System.in);

            System.out.println("Enter the Course Name");
            String name = s1.nextLine();

            System.out.println("Enter the course ID");
            int courseID =  s1.nextInt();

            System.out.println("Enter the course Fess");
            int courseFess = s1.nextInt();

            c1.courseFess = courseFess;
            c1.courseNAme = name;
            c1.courseID = courseID;

            c1.displayCourseDetails();
        }
        else
        {
            System.out.println("Enter valid username and password");
        }

    }

    public static void main(String[] args) {
        authenticate("Admin", "1234");
    }


}
