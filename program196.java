
//accept num and check 21st bit is on or off
import java.lang.*;
import java.util.*;

class Bitwise {
    public boolean CheckBit(int iNo) {
        int iMask = 0X00100000; // 1048576
        int iResult = 0;

        iResult = iNo & iMask;
        if (iResult == 0) {
            return false;
        } else {
            return true;
        }
    }
}

class program196 {
    public static void main(String arg[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter num");
        int value = sobj.nextInt();

        Bitwise bobj = new Bitwise();
        boolean bret = bobj.CheckBit(value);

        if (bret == true) {
            System.out.println("bit is on");
        } else {
            System.out.println("bit is off");
        }
    }
}