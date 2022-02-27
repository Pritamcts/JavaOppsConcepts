class A{
    public void show(){
        System.out.println("In A");
    }
}
class B extends A{
    @Override   //Method overriding
    public void show(){
        super.show(); //Super is used to call the super class method
        System.out.println("In B");
    }
}


public class MethodOverriding {
    public static void main(String[] args) {
        B obj=new B();
        obj.show();
    }
}
