
//0000 0000  0000 0000 0000 0000 0000 0000
//0     0     0    0    2    0    0     0
//accept num and check 4th bit is off and if off then turn it on
import java.lang.*;
import java.util.*;

class Bitwise {
    public int OnBit(int iNo) {
        int iMask = 0X00000008; //
        int iResult = 0;

        iResult = iNo | iMask;

        return iResult;

    }
}

class program198 {
    public static void main(String arg[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter num");
        int value = sobj.nextInt();

        Bitwise bobj = new Bitwise();
        int iret = bobj.OnBit(value);

        System.out.println("updated number is:" + iret);
    }
}