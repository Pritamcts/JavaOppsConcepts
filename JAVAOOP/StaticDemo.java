class Student{
    int dept;
    int roll; //Non static variable are those variable which are not same for all the object😢..
    static String monitor;//Static variable are those variable which are same for all the for all the object😎..
    public void Show(){
        System.out.println(dept+ " : "+ roll+":"+monitor);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Student pritam = new Student();
        pritam.dept=2;
        pritam.roll=608;
        pritam.monitor="rahul";
        Student richik= new Student();
        richik.dept=2;
        richik.roll=607;
        richik.monitor="suvam";
        Student sriza= new Student();
        richik.dept=3;
        richik.roll=606;
        richik.monitor="rahul";

        pritam.Show();
        richik.Show();
        sriza.Show();

        
    }
}
