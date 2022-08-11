// string input  hello
//string patterns  
/*
 h  e   l   l   o
 h  e   l   l   o
 h  e   l   l   o
 h  e   l   l   o
 h  e   l   l   o
 */

import java.lang.*;
import java.util.*;

class program337 {
    public static void main(String arg[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter string");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr.length; j++) {
                System.out.print(Arr[j] + "  ");
            }
            System.out.println();
        }
    }
}
