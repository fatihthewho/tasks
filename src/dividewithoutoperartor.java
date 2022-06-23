public class dividewithoutoperartor {


    public static void main(String[] args) {

        /*
        * 18) Numbers - Divide without / operator
Write a method that can divide two numbers without using division operator*/
        dividewithout(-200,30);

    }

    public static void dividewithout(int num1,int num2)
    {
        double divide=0;
        int abs1=1;
        int abs2=1;
        int decimal=0;

        if (num1 != Math.abs(num1) )
        {
            abs1=-1;
        }
        if (num2!=Math.abs(num2))
        {
            abs2=-1;
        }

        num1=num1*abs1;
        num2=num2*abs2;


        if (num1>num2) {
            while (num2 < num1) {
                num1 = num1 - num2;
                divide++;
            }
        }

        else if(num2>num1)
        {
            while (num1<num2) {
                num1 = num1 * 10;
                decimal++;
            }
            while (num2 <num1) {
                num1 = num1 - num2;
                divide++;

            }

            for (int i = 0; i < decimal ; i++) {
                divide=divide*0.1;
            }

        }

        String decimaldigit= "%."+decimal+"f";
        System.out.format(decimaldigit, divide*abs1*abs2);



    }
}
