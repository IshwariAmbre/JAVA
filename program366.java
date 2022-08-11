
//DBMS PROJECT 
import java.lang.*;
import java.security.cert.TrustAnchor;
import java.util.*;

// create table student(RID int, Name varchar(255), Salary int);
// Database table / schema
class Student {
    public int RID;
    public String Name;
    public int Salary;

    private static int Generator;

    static {
        Generator = 0; // access from object
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

class DBMS {
    public LinkedList<Student> lobj;

    public DBMS() {
        lobj = new LinkedList<>(); // aat ghetla
    }

    public void StartDBMS() {
        System.out.println("MARVELLOUS CUSTOMISED DBMS STARTED SUCCESFULLY");
    }

    public void InsertData(String str, int value) {
        Student sobj = new Student(str, value);
        lobj.add(sobj);
    }

    public void DisplayAll() // *query of dbms * */
    {
        for (Student sref : lobj) // calls reference data
        {
            sref.DisplayData();
        }
    }

    public void DisplaySpecific(int rid) // rid for specific employye
    {
        for (Student sref : lobj) // calls reference data
        {
            if (sref.RID == rid) {
                sref.DisplayData();
                break;
            }
        }
    }

    public void DisplaySpecific(String str) // rid for specific employye
    {
        for (Student sref : lobj) // calls reference data
        {
            if (str.equals(sref.Name)) {
                sref.DisplayData();
                break;
            }
        }
    }
}

class program366 {
    public static void main(String arg[]) {
        DBMS dobj = new DBMS();
        dobj.StartDBMS();
        dobj.InsertData("ISHWARI", 3000);
        dobj.InsertData("TUSHAR", 2000);
        dobj.InsertData("SIDDHI", 1000);

        dobj.DisplaySpecific(2);
        dobj.DisplaySpecific("TUSHAR");
    }
}