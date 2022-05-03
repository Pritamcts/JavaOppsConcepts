public class ForeachLoop {
    public static void main(String[] args) {
        // int a[]={2,3,4,5,6};
        // for(int k:a) //💥💥For each loop for simple array
        // {
        //     System.out.print(k);
        // }

        int d[][]={
            {23,34,59},
            {20,30,40},
            {10,30,80}
        };

        for(int k[]:d)
        {
            for(int l:k){
                System.out.print(" "+l);
            }
            System.out.println();
        }
    }
}
