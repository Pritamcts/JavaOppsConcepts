class calc{
    public int add(int ... n) //💨Variable length argument
    {
        int sum=0;
        for(int i:n){
             sum=sum+i;
        }
        return sum;
    }
}


public class VargsDemo {
    public static void main(String[] args) {
        calc obj =new calc();
        System.out.print(obj.add(2,3,4,5,6,7,8,9));
    }
}
