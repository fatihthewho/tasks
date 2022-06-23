package javagroupinterviewweek3;

public class reverseString {

    //String - Reverse
    //Write a return method that can reverse String
    //Ex: Reverse("ABCD"); ==> DCBA

    public static String reverse(String str)
    {

        String str1="";
        for (int i = 0; i < str.length(); i++) {
            str1+=str.charAt(str.length()-1-i);
        }

        return str1;
    }

    public static void main(String[] args) {

        System.out.println(reverse("ABCDEF"));

    }
}
