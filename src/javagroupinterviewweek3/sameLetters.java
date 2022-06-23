package javagroupinterviewweek3;

public class sameLetters {

    //2.    String - Same letters
    //Write a return method that check if a string is build out of the same letters as another string.
    //Ex:  same("abc",  "cab"); -> true
    //same("abce",  "abbccd"); -> false:

    public static boolean same(String str1,String str2)
    {
        boolean same=true;
        for (int i = 0; i < str1.length() ; i++) {
                if(!str2.contains(""+str1.charAt(i)))
            {
                return false;
            }
        }

        for (int i = 0; i <str2.length() ; i++) {
            if(!str1.contains(""+str2.charAt(i)))
            {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(same("abbbc", "cabd"));
    }
}


