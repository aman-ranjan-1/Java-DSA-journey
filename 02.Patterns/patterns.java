// This file contains all basic patterns 
// To run each pattern call the method in main method 
// also define the correct arguments while calling any method ;


public class patterns {
    public static void main(String[] args) {
        pattern7(5);         // call any pattern :)
    }
    // pattern 3 

    // * * * * * 
    // * * * * 
    // * * * 
    // * *
    // * 
    public static void pattern3(int n){
        for (int row = 0 ; row < n; row++){
            for(int col = 0 ; col < n - row ;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // pattern 4

    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5

    public static void pattern4(int n){
        for (int row = 1 ; row <= n; row++){
            for(int col = 1 ; col <= row ;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    // pattern 5 (take n = 5 for this)
    
    // o
    // o o
    // o o o
    // o o o o
    // o o o o o
    // o o o o
    // o o o
    // o o
    // o

    public static void pattern5(int n){
        for (int row = 1;row <= n ; row++){
            for (int col = 1; col <= row; col++){
                System.out.print("o ");
            }
            System.out.println();
        }
        for (int row = 0 ; row < n-1; row++){
            for(int col = 0 ; col < n - row -1;col++){
                System.out.print("o ");
            }
            System.out.println();
        }
    }
    // pattern 6
    // Another method for pattern 5

    public static void pattern6(int n){
        for (int row = 0;row < 2*n;row++){
            int totalcols = row > n ? 2*n -row : row;
            for (int col = 0 ; col < totalcols;col++){
                System.out.print("o ");
            }
            System.out.println();
        }
    }
    // pattern 7

    //     o
    //    o o
    //   o o o
    //  o o o o 
    // o o o o o
    //  o o o o
    //   o o o
    //    o o
    //     o

    public static void pattern7(int n){
        for (int row = 0;row < 2*n;row++){
            int totalcols = row > n ? 2*n -row : row;
            int noSpace = n - totalcols;
            for (int s = 0; s < noSpace;s++){
                System.out.print(" ");
            }
            for (int col = 0 ; col < totalcols;col++){
                System.out.print("o ");
            }
            System.out.println();
        }
    }

}
