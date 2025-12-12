class Half_pyramid_Inverted{
    public static void main(String args[]){
        /*
        *****
         ****
          ***
           **
            *
        */
       //outer loop-
       for(int i=1;i<=5;i++){
        //for space--
        for(int j=1;j<=i-1;j++){
            System.out.print(" ");
        }
        // for star--
        for(int j=1;j<=5-i+1;j++){
            System.out.print("*");
        }
        System.out.println();
       }

    }
}