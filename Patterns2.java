

public class Patterns2 {
    public static void main(String[] args) {   

/*         // Print a solid rhombus.
         int n = 5;
        for (int k = 1; k <= n; k++){
            // for space
            for ( int j = 1; j<=n-k; j++){
                System.out.print("f");
            }

            // for star
            for (int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println("");
        } */

/*         // Print a number pyramid
        int n = 5;
        for ( int i = 1; i <= n; i++){
            // for spaces 
            for ( int j = n-i; j>0; j--){
                System.out.print("f");
            }

            // for star
            for ( int j = 0; j < i; j++){
                System.out.print(i + " ");
            }
            System.out.println("");
        }  */

/*          // Print a palindromic number pyramid.
            int n = 5;
            for ( int i = 1; i <= n; i++){
                // for spaces
                for ( int j = n-i; j>0; j--){
                    System.out.print("f");
                }

                // for star (part 1)
                for ( int j = i; j > 0; j--){
                    System.out.print(j);
                }

                // for star (part 2)
                for ( int j = 1; j < i; j++) {
                    System.out.print(j + 1);
                }
                System.out.println("");
            } */


/*         // butterfly pattern
        int n = 4;

        // first half
        for (int i = 1; i<=n; i++){
            // for star(part-1)
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }

            // for space[2*(n-i)]
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            // for star (part -2)
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        // second half
        for (int i = n; i>=1; i--){
            // for star(part-1)
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }

            // for space[2*(n-i)]
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            // for star (part -2)
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        } */

       
/*         // diamond pattern
        int n = 4; 

        // first half
        for (int i = 1; i<=n; i++){
            // for space
            for (int j = n-i; j>=1; j--){
                System.out.print(".");
            }

            // for star 
            for (int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        // second half
        for (int i = n; i>=1; i--){
            // for space
            for (int j = n-i; j>=1; j--){
                System.out.print(".");
            }

            // for star 
            for (int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println("");
        } */ 

       
/*        // hollow rhombus
       int n = 5; 
       for(int i = 1; i <=n; i++){
        // for space 
        for (int j = 1; j<=n-i; j++){
            System.out.print(".");
        }

        // for star
        for(int j = 1; j<=n; j++){
            if(i==1||j==1||i==n||j==n){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        } 
        System.out.println("");
       } */




/*         //hollow Butterfly
        int n = 5;
        for (int i = 1; i <=n; i++){
            int count = 1;
            // for star1
            System.out.print("*");

            //for space
            for (int j = i-2; j>0; j--){
                System.out.print(".");
                count++;
            }

            //for star2
            for(int j = 1; j<=i-count; j++){
                System.out.print("*");
            }

            //for space
            int count2=1;
            for(int j = 10-(i*2); j>=1; j--){
                System.out.print(".");
                count2++;
            }

            //for star 1
            if(10-(count2+i)>0){
                System.out.print("*");
                count2++;
            }

            //for space2
            for(int j=10-(count2+i); j>=1; j--){
                System.out.print(".");
            }
            System.out.print("*");
            
            System.out.println("");
        }
            
        for (int i = n; i>=1; i--){
            int count = 1;
            // for star1
            System.out.print("*");

            //for space
            for (int j = i-2; j>0; j--){
                System.out.print(".");
                count++;
            }

            //for star2
            for(int j = 1; j<=i-count; j++){
                System.out.print("*");
            }

            //part2
            //for space
            int count2=1;
            for(int j = 10-(i*2); j>=1; j--){
                System.out.print(".");
                count2++;
            }

            //for star 1
            if(10-(count2+i)>0){
                System.out.print("*");
                count2++;
            }

            //for space2
            for(int j=10-(count2+i); j>=1; j--){
                System.out.print(".");
            }
            System.out.print("*");

            System.out.println("");
        } */



/*        //Print half Pyramid.
       int n = 5;
       for (int i=1; i<=n; i++){
        // for space
        for (int j=n-i; j>=1; j--){
            System.out.print(".");
        }

        for(int j=1; j<=i; j++){
            System.out.print(j+" ");
        }
        System.out.println("");
       } */



      //Print Inverted Half Pyramid.
      int n=5;
      for (int i=n; i>1; i--){
        for (int j=1; j<=i; j++){
            System.out.print(i+" ");
        }
        System.out.println("");
      } 





    }
}