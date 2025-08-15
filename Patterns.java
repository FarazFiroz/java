
public class Patterns {
   public static void main(String args[]) {
    /* // Solid rectangle
    int n = 5;
    int m = 5;
    for (int i = 0; i < n; i++) {
        for(int j = 0; j<m; j++){
            System.out.print("*");
        }
        System.out.println("");
    }  */



  /*  // hollow rectangle
   int n = 5;
   int m = 4;
   for(int i = 0; i<n; i++){
    for(int j = 0; j<m; j++){
        if(i == 0 || j == 0 || j == m-1 || i == n-1){
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }
    System.out.println("");
   } */


/*     // Half Pyramid
    int n = 4;
    for(int i = 1; i <= n; i++){
        for(int j = 0; j<i; j++){
            System.out.print("*");
        }
        System.out.println("");
    } */


/*    // Inverted half pyramid
   int n = 5;
   for (int i = 0; i < n; i++){
    for (int j = 0; j<n-i; j++){
        System.out.print("*");
    }
    System.out.println("");
   }

   } */

/*     // Inverted and rotated half pyramid
    int n = 4;
    for(int i = 0; i<n; i++){
        // for space
        for(int j = 0; j<n-i; j++){
            System.out.print(" ");
        } 

        // for star
        for (int k = 0; k<i+1; k++){
            System.out.print("*");
        }

        System.out.println("");
    } */
   
/*    // Half Pyramid with Numbers
   int n = 5;
   for (int i = 1; i<=n; i++){
    for(int j = 1; j<=i; j++){
        System.out.print(j);
    }
    System.out.println("");
   } */

/*     // Inverted Half Pyramid with Numbers
    int n = 5;
    for (int i = 0; i < n; i++){
        for (int j = 1; j<=n-i; j++){
            System.out.print(j);
        }
        System.out.println("");
    } */

/*    // Floyd's Triangle
   int n = 5;
   int counter = 1;
   for (int i = 0; i<n; i++){
    for( int j = 0; j<=i; j++){
        System.out.print(counter + " ");
        counter++;
    }
    System.out.println("");
   } */

/*     // 0-1 Triangle
    int n = 5;
    for (int i = 1; i <= 5; i++){
        for (int j = 1; j <= i; j ++){
            if((i+j)%2 == 0){
                // for even
                System.out.print("1 ");
            } else {
                // for odd
                System.out.print("0 ");
            }
        }
        System.out.println("");
    } */




   }
}
 