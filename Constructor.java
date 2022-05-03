class A{
    int num1;
    int num2;
    public A()//This is default constructor
    {
        // System.out.print("Hello");
    }
    public A(int n)//This is parametarized constructor
    {
        num1=n;
        num2=n;
        System.out.print(num1);
    }
    public A(double number1,int number2){
        num1=(int)number1;
        num2=number2;
        System.out.println(num1);
        System.out.print(num2);
    }
}

public class Constructor {
    public static void main(String[] args) {
      A obj =new A(6.8,9);
    }
}
