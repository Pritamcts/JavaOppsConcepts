public class TwoDarray {
    public static void main(String[] args) {
        int a[][]={ //2d array
            {2,3,4,6},
            {3,5,89,2},
            {90,50,40,21}
        };
        // System.out.println(a[0][1]);

        for(int i=0;i<a.length;i++){ //jagged array
            for(int j=0;j<a[i].length;j++){
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
    }
}
