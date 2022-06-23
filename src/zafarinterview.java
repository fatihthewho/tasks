import java.util.*;

public class zafarinterview {

    public static void main(String[] args) {

        System.out.println(count(10, "abca"));
    }

    public static Integer count(int a,String b)
    {
        String newb="";

        int remainder= a % b.length();
        int times=(a-remainder)/b.length();

        for (int i = 0; i < times ; i++) {
         newb+=b;
        }

        Map<Character,Integer> frequentmap= new HashMap<>();
        int counter=1;
        Character max='a';
        int maxx=1;
        for (int i = 0; i <remainder ; i++) {
            newb+=b.charAt(i);

        }

        for (int i = 0; i < newb.length(); i++) {

            if (frequentmap.keySet().contains(newb.charAt(i)))
            {
                counter=frequentmap.get(newb.charAt(i))+1;
                frequentmap.put(newb.charAt(i),counter);
            }

            else {
                frequentmap.put(newb.charAt(i), counter);
            }

            if (frequentmap.put(newb.charAt(i),counter)>maxx)
            {
                max=newb.charAt(i);
                maxx=frequentmap.get(newb.charAt(i));
            }
            counter=1;

        }



        System.out.println(newb);
        System.out.println(max+":");


        return maxx;
    }
}
