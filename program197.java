
//0000 0000  0000 0000 0000 0000 0000 0000
//0     0     0    0    2    0    0     0
//accept num and check 14th bit is on or off
import java.lang.*;
import java.util.*;

class Bitwise {
    public boolean CheckBit(int iNo) {
        int iMask = 0X00002000; // 8192
        int iResult = 0;

        iResult = iNo & iMask;
        if (iResult == 0) {
            return false;
        } else {
            return true;
        }
    }
}

class program197 {
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