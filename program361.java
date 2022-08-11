
//PROJECT
import java.lang.*;
import java.util.*;

class Student {
    public int RID;
    public String Name;
    public int Salary;

    private static int Generator;

    static {
        Generator = 0;
    }

    public Student(String str, int value) {
        this.RID = ++Generator;
        this.Name = str;
        this.Salary = value;
    }

    public void DisplayData() {
        System.out.println(this.RID + "\t" + this.Name + "\t" + this.Salary);

    }

}

class program361 {
    public static void main(String arg[]) {
        Student obj1 = new Student("ISHWARI", 100);

        Student obj2 = new Student("TUSHAR", 200);
        Student obj3 = new Student("samiskha", 300);
        Student obj4 = new Student("akshay", 400);

        obj1.DisplayData();
        obj2.DisplayData();
        obj3.DisplayData();
        obj4.DisplayData();
    }
}
