import java.lang.*;

{public static void main(String arg[]){Scanner sobj=new Scanner(System.in)

System.out.println("enter num");int iNo=sobj.nextInt();

System.out.println("enter starting point");int iStart=sobj.nextInt();

System.out.println("enter ending point");int iEnd=sobj.nextInt();

int iMask1=0xffffffff;int iMask2=0xffffffff;int iMask=0;

iMask1=iMask1<<(iStart-1);iMask2=iMask2>>(32-iEnd);

iMask=iMask1&iMask2;

int iResult=

}}