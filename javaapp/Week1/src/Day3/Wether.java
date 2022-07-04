package Day3;

public class Wether {
    public static void main(String[] args) {
        boolean isSnowing = true;
        boolean isRaining = false;
        double temperature = 30.0;

        if(isSnowing && isRaining && temperature <=50.0)
        {
            System.out.println("Let’s stay home");
        }
        else{
            System.out.println("Let’s go out!");
        }
    }
}
