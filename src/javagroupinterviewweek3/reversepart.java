package javagroupinterviewweek3;

import java.util.*;

public class reversepart {

    //6. String - Sort Letters and Numbers from alphanumeric String
    //Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together.
    //Ex:
    //Input:  "DC501GCCCA098911"
    //OutPut: "CD015ACCCG011899"

    public static void main(String[] args) {
        System.out.println(reversepart("DC501GCCCA098911"));
    }

    public static String reversepart(String str)
    {
        String strnew="";
        List<Character> list = new ArrayList<>();


        for (int i = 0; i <str.length() ; i++) {
           list.add(str.charAt(i));
           if (i==str.length()-1)
           {
               Collections.sort(list);
               strnew+=list;
               list.clear();
           }
           else if (Character.isDigit(str.charAt(i)) && !Character.isDigit(str.charAt(i+1)))
           {
               Collections.sort(list);
               strnew+=list;
               list.clear();
           }

           else if (!Character.isDigit(str.charAt(i)) && Character.isDigit(str.charAt(i+1)))
            {
                Collections.sort(list);
                strnew+=list;
                list.clear();
            }


        }


        return strnew;
    }
}
