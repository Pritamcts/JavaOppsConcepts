class Calc{
    int num1;
    int num2;
    int result;

    public void perform() //This is a methode
    {
        result=num1+num2;
    }

}

public class ObjectDemo {
    public static void main(String[] args) {
       Calc obj =new Calc();//Object knows something and dose some thing
       obj.num1=2;
       obj.num2=6;
       obj.perform();
       System.out.print(obj.result);
    }
}
