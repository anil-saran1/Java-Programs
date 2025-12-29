public class Numberpyramid{
    /*            Spaces    number
    ....1          4        1-1times 
    ...2.2         3        2-2times
    ..3.3.3        2        3-3times
    .4.4.4.4       1        4-4times
    5.5.5.5.5      0        5-times
                  n-i       
    */  
   public static void main(String args[]){
    int n=5;
    int count=1;
    //outer loop..n times
    for(int i=1;i<=n;i++){
        //inner loop space+number..
        //spaces..n-i
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        //number i-times
         for(int j=1;j<=i;j++){
            System.out.print(count+" ");
        }
        count++;
        System.out.println();
    }
   }
}