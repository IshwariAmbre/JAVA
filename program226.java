import java.lang.*;
import java.util.*;

class node {
    public int data;
    public node next; // struct node*next
}

class SinglyLL {
    public node Head;
    public int Count;

    public SinglyLL() {
        Head = null;
        Count = 0;
    }

    public InsertFirst(int no)
    {
       node newn=new node();  //newnode

       newn.data=no;
       newn.next=null;

       if(Head==null)
       {
        Head=newn;
       }
       else
       {
        newn.next=Head;
        Head=newn;
       }
       Count++;
    }

    public void InsertLast(int no) {
        node newn = new node(); // newnode

        newn.data = no;
        newn.next = null;

        if (Head == null) {
            Head = newn;
        } else {
            node temp = Head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newn;
        }
        Count++;
    }

    public void Display() {
        node temp = Head;

        System.out.println("elements of LL are:");
        while (temp != null) {
            System.out.println("|" + temp.data + "|->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public int CountNode() {
        return Count;
    }
}

class program226 {
    public static void main(String arg[]) {
        SinglyLL obj = new SinglyLL();

        obj1.InsertFirst(no:51);
        obj1.InsertFirst(no:21);
        obj1.InsertFirst(no:11);

        obj1.InsertLast(no:101);
        obj1.InsertLast(no:111);

        obj1.Display();

        System.out.println("number of elements are:" + obj.CountNode());
    }
}
