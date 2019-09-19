package lambton;

public class FirstDay {

    //public static void runfirst()
//    {
//        System.out.println("Sanjeev first");
//    }
    public static void main(String[] args) {

        //variable assigned
        int a =4;
        int b = 3;

        //printed the output
        System.out.println("output"+(a+b));

        System.out.println("Max integer value"+Integer.MAX_VALUE);// printing the integer max value
        System.out.println("min integer value"+Integer.MIN_VALUE);// printinh the integer min value

        Student student = new Student();
        student.studentdata();

        Student studenttwo = new Student();
        studenttwo.studentid = 2;
        studenttwo.studentname = "rajeev";
        student.display();

        Student studentthree = new Student();
        studentthree.studentid = 3;
        studentthree.studentname = "rajesh";
        student.display();

        for(int i=0; i<10; i++)
        {
            System.out.println("sanjeev");
        }
    }
}
