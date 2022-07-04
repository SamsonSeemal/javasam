package Day2;
import  java.util.Scanner;

public class Reverse {
    public static String reversString(String input){

        char[] s = input.toCharArray();
        String bag = "";
        for(int i= s.length-1;i>=0;i--)
        {
            bag = bag + s[i];
        }
        return  bag;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String to reverse");
        String originalString = sc.next();

        String result = reversString(originalString);
        System.out.println("Original String is :"+ originalString);
        System.out.println("Reversed String is :"+ result);
    }
}
