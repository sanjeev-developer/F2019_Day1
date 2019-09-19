package lambton;

public class Student {

    int studentid;
    String studentname;

    public void studentdata()
    {
        studentid = 1;
        studentname ="sanjeev gupta";
        display();
    }

    public void display()
    {
        System.out.println("studentid = "+studentid);
        System.out.println("student name = "+studentname);
    }

//    public static void main(String[] args) {
//        Student student = new Student();
//        student.studentdata();
//    }

}
