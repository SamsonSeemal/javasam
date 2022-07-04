package Day2;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int N = 5;
        int sum =0;
        for(int i=0;i<=N;i++)
        {
            sum = (i*(i+1)/2);
        }
        System.out.println(sum);
    }
}
