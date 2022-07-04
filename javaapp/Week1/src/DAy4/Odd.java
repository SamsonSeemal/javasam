package Day1;

public class Odd {
    public void isOdd(int num){
        if(num%2 !=0)
        {
            System.out.println(num);
        }
        else if(num%2 == 0)
        {
            System.out.println((num/10+1)*10);
        }
        else{
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        Odd o = new Odd();
        o.isOdd(45);
        o.isOdd(44);
        o.isOdd(-5);
    }
}
