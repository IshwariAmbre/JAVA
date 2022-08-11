// string input HELLO ,string patterns  
/*
hello
hell
hel
he
h
 */

import java.lang.*;
import java.util.*;

class program340 {
    public static void main(String arg[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter string");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        for (int i = Arr.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(Arr[j] + "  ");
            }
            System.out.println();
        }
    }
}
