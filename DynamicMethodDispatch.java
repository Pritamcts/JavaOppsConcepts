class A{
    public void show(){
        System.out.println("In A");
    }
}
class B extends A{
    public void show(){
        System.out.println("In B");
    }
}
class C extends A{
    public void show(){
        System.out.println("In C");
    }
}


//Compile time and run time 
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A obj=new B();//Run time polymorphism
        obj.show();
        obj=new C();//⭕Dynamic method dispatch
        obj.show();
    }
}
