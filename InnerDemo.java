 class Outer{
    int a;
    public void Display(){
        System.out.println("This is outer class");
    }
    class Inner{
        public void Show(){
            System.out.println("This is a inner class");
        }
    }
}

public class InnerDemo {
    public static void main(String[] args) {
        Outer obj1 =new Outer();
        obj1.Display();
        Outer.Inner obj2 = obj1.new Inner();
        obj2.Show();
    }
}
