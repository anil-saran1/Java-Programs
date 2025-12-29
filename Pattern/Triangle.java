public class Triangle{
    /*
    1
    0 1
    1 0 1
    0 1 0 1
    */
    public static void main(String args[]){
        int n=4;
        //outer loop...
        for(int i=1;i<=n;i++){
            //inner loop...
            for(int j=1;j<=i;j++){
                //if sum of  i+j is even then print 1 else 0
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
    
}