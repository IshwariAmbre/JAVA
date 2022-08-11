
//32  31 30 29  28 27 26 25  24 23 22 21   20 19 18 17  16 15 14 13  12 11 10 9   8 7 6 5      4 3 2 1
//0   0   0     0  0  0  0   0  0  0  0    0  0  0  0   0  0  0  0   0  0  0  0   0 1 0 0(4)   1 0 0 0(8)
//on ahe tar off, off ahe tar on  with filter
//accept num and position from user and toggle the bit at that pos and return that num
import java.lang.*;
import java.util.*;

class Bitwise {
    public int ToggleBit(int iNo, int iPos) {
        if ((iPos <= 0) || (iPos > 32)) {
            System.out.println("invalid pos");
            return 0;

        }

        int iMask = 0X00000001;
        int iResult = 0;

        iMask = iMask << (iPos - 1);

        iResult = iNo ^ iMask;
        return iResult;

    }
}

class program203 {
    public static void main(String arg[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter num");
        int value = sobj.nextInt();

        System.out.println("enter pos");
        int pos = sobj.nextInt();

        Bitwise bobj = new Bitwise();
        int iret = bobj.ToggleBit(value, pos);

        System.out.println("updated number is:" + iret);
    }
}