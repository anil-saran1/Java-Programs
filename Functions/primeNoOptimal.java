import java.util.*;
public class primeNoOptimal {
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){ //optimal approach--check till sqrt(n)
        //or for(int i=2;i<=Math.sqrt(n);i++)
        
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to check prime or not: ");
         int num=sc.nextInt();
        /* if(isPrime(num)){
             System.out.println(num+" is a prime number.");
         }else{
            System.out.println(num+" is not a prime number.");
        */ 
        
        System.out.println("Prime numbers from 1 to 300:");
        for(int i=2; i<=num; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}