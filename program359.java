
//ACCEPT STRING FROM USER AND DISPLAY FREQUENCY word
//USE HASH MAP/TABLE
//hello world india hello hi hello //hello 3 times
import java.lang.*;
import java.util.*;

class program357 {
    public static void main(String arg[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter string");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        HashMap<Character, Integer> hobj = new HashMap<>(); // imp
        int Frequency = 0;

        for (char ch : Arr) {
            if (hobj.containsKey(ch)) {
                Frequency = hobj.get(ch);
                hobj.put(ch, Frequency + 1);
            } else {
                hobj.put(ch, 1);
            }
        }
        Set<Character> setobj = hobj.keySet();
        int iMax = 0;
        char c = ' ';

        for (char value : setobj) {
            if (hobj.get(value) > iMax) {
                iMax = hobj.get(value);
                c = value;
            }
        }
        System.out.println(c + " occurs maximum times ie:" + iMax);
    }
}