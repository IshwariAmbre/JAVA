
//PROJECT
import java.lang.*;
import java.util.*;

class Student {
    public int RID;
    public String Name;
    public int Salary;

    private static int Generator = 0;

    public Student(int no, String str, int value) {
        this.RID = no;
        this.Name = str;
        this.Salary = value;
    }

}

class program360 {
    public static void main(String arg[]) {
        Student sobj = new Student(11, "ISHWARI", 100);

        System.out.println(obj.RID);
        System.out.println(obj.Name);
        System.out.println(obj.Salary);

    }
}
