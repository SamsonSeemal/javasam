package Day3;
//Static variable in Java is variable which belongs to the class and initialized
//only once at the start of the execution. It is a variable which belongs to the class
//and not to object


//Non-static variables are specific to that instance of a class.
//Static variable is like a global variable and is available to all methods.
//Non-static variable is like a local variable and they can be accessed through only instance of a class
public class StaticAndNonStatic {
//    Static Member
    static int a = 10;
    static int b = 20;

    static void addition(int a, int b){
        System.out.println(a+b);
    }

//    Nonstatic Member
    int x=5;
    int y= 5;

    void product (int x, int y){
        System.out.println(x*y);
    }

    public static void main(String[] args) {

//        calling Static members
        System.out.println("A : " + a );
        System.out.println("B : " + b);
        addition(a,b);

//          calling Non-static members
        StaticAndNonStatic s1 = new StaticAndNonStatic();
        System.out.println("X :" + s1.x);
        System.out.println("Y :" + s1.y);

        s1.product(s1.x, s1.y);

    }
}
