public class Butterfly{
    /*          line(i)    star+space+star
    *      *      1         1    6     1
    **    **      2         2    4     2
    ***  ***      3         3    2     3
    ********      4         4    0     4
    ***  ***      n         i  2(n-i)  i
    **    **
    *      *
    */

   public static void main(String args[]){
    int n=4;
    //1st half
    //outer loop..i times
    for(int i=1;i<=n;i++){
        //star
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        //Space....2*(n-i)
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        //Star..i times
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    //2nd half
    for(int i=3;i>=1;i--){  // just oppsite of 1st half..
                for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        //Space....2*(n-i)
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        //Star..i times
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();

    }
   }
}