 abstract class Human{
    public abstract void result();//dclearing method using abstract keyword
}

 class Men extends Human{
   public  void result(){
    System.out.println("This is the result");
   }
}
public class AbstractDemo {
    public static void main(String[] args) {
       Human obj =new Men();
       obj.result();
    }
}
