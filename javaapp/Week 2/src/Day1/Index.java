package Day2;
import java.util.Scanner;
public class Index {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter any String");
        String s = s1.nextLine();

        System.out.println("Enter the index");
        int i = s1.nextInt();

        System.out.println("Character at position " + i + "is");
        System.out.println(s.charAt(i));
    }
}
