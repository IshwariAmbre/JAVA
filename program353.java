
// COMMON BITS DISPLAY
import java.lang.*;
import java.util.*;

class program353 {
    public static void main(String arg[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter number");
        int iNo1 = sobj.nextInt();

        System.out.println("enter 2nd number");
        int iNo2 = sobj.nextInt();

        int iNo = iNo1 & iNo2;

        int iMask = 0x00000001;
        int iResult = 0;

        for (int i = 1; i <= 32; i++) {
            iResult = iNo & iMask;

            if (iResult == iMask) {
                System.out.println(i);
            }
            iMask = iMask << 1;
        }

    }
}