package codingbat;

public class PrivateConstructorClass {


    private  PrivateConstructorClass()
    {
        System.out.println("class created with private constructor");
    }

    public static void main(String[] args) {

        PrivateConstructorClass newclass = new PrivateConstructorClass(){};
        PrivateConstructorClass newclass2 = new PrivateConstructorClass(){};
    }
}
