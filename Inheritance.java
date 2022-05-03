//Single and multilevel inheritance
//it is and it has
class A{
    public int add(int a,int b){
       return a+b;
    }
}
class B extends A{
    public int mul(int l, int k){
        return l*k;
    }
}
class C extends B{
    public int div(int f,int r){
        return f/r;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        C ob=new C();
        System.out.println(ob.add(20,30));
        System.out.println(ob.mul(50,30));
        System.out.println(ob.div(40,2));

    }
}
