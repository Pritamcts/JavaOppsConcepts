class A{
    int num1;
    int num2;
    int res1;
    int res;
    public void mul(){
        res=num1*num2;
    }
    public void mul(int a,int b){
        a=5;
        b=4;
        res1=a*b;
    }
    public void show(){
        System.out.println(res);
        System.out.println(res1);
    }
}

public class MethodeOverlodaing {
    public static void main(String[] args) {
        A obj = new A();
        obj.num1=20;
        obj.num2=5;
        obj.mul();
        obj.show();
    }
}
