package Day2;

public class PrimeFactor {
    public static void main(String[] args) {
        int Num = 12;
        if(Num>100 || Num <=2)
        {
            System.out.println("Invalid Number");
        }
        else{
            int div = 1;
            while(div<=Num)
            {
                if(Num%div  == 0)
                {
                    System.out.println(div);
                }
                div++;
            }
        }
    }
}
