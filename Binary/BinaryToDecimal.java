public class BinaryToDecimal{

    public static void B2D(int binNum){
       int pow=0;
       int decNum=0;

       while(binNum >0){
        int lastDigit= binNum % 10;
        decNum = decNum +(lastDigit * (int)Math.pow(2,pow));//typecast becoz it returns decimal
        pow++;
        binNum=binNum/10;
       }
       System.out.println(decNum);

    }
    public static void main(String args[]){
        B2D(101);

    }
}
