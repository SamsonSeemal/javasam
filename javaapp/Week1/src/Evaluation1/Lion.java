package Evaluation1;

public class Lion {
    String name;
    boolean isHungry;
    int age;
    static int totalDeaths;
    static void printKillings(){
        System.out.println("Total killings by lions in jungle = "+totalDeaths);
    }
    void thinking(String name, boolean isHungry, int age) {
        this.name = name;
        this.isHungry = isHungry;
        this.age = age;

        if( isHungry!=true)
        {
            System.out.println(name + " is sleeping");

        }
        else if (isHungry=true & age > 12) {
            totalDeaths = totalDeaths + 2;
            System.out.println(name + " Has killed 2 animal");
        }
        else if (isHungry=true & age<=12 & age >=2)
        {
            totalDeaths = totalDeaths+1;
            System.out.println(name + " has killed one animal");
        }
        else if (isHungry=true & age<=12)
        {
            System.out.println(name + " is  calling mom");
        }
    }


    public static void main(String[] args) {

        Lion l1 = new Lion();
        l1.thinking("sam" , true, 15);
        Lion l2 = new Lion();
        l2.thinking("sidhu" , true, 5);
        Lion l3 = new Lion();
        l3.thinking("Bro" , false, 21);
        Lion.printKillings();
    }
}
