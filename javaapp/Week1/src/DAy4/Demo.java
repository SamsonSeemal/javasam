package Day1;

public class Demo {

    int i;
    String s;
    float f;

    Demo()
    {
        System.out.println("Inside Demo()......");
    }

    Demo(String s)
    {

        this(2);
        this.s = s;
        System.out.println("Inside Demo(String)....." + s);
    }
    Demo(int i )
    {
        this(20.05f);
        this.i = i;
        System.out.println("Inside Demo(int)....."+ i);
    }
    Demo(float f)
    {
        this();
        this.f=f;
        System.out.println("Inside Demo(float)............." + f);
    }


    public static void main(String[] args) {
        Demo d1 = new Demo("Samson");
    }
}
