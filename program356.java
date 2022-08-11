
//ACCEPT STRING FROM USER AND DISPLAY max FREQUENCY char
//USE HASH MAP/TABLE
import java.lang.*;
import java.util.*;

class program356 {
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
        System.out.println(setobj);
    }
}