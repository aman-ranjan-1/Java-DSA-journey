// This file contains all basic patterns 
// To run each pattern call the method in main method 
// also define the correct arguments while calling any method ;


public class patterns {
    public static void main(String[] args) {
        pattern12(5);         // call any pattern :)
    }
    // basic pattern - * * * * *

    public static void basicpattern(int n){
        for(int i = 0;i<n;i++){
            System.out.print("* ");
        }
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
    // pattern 8 - 
    
    // 5 4 3 2 1
    // 5 4 3 2
    // 5 4 3
    // 5 4
    // 5

    public static void pattern8(int n){
        for (int row = 1;row<=n;row++){
            for (int col = n; col >= row; col--) {
                System.out.print(" "+col);
            }
            System.out.println();
        }
    }

    // Pattern 9 -
    // 1 2 3 4 5 
    // 1 2 3 4 
    // 1 2 3 
    // 1 2
    // 1 

    public static void pattern9(int n){
        for (int row = 1;row<=n;row++){
            for (int col = n; col >= row; col--) {
                System.out.print(" "+(n-col+1));
            }
            System.out.println();
        }
    }

    // Pattern 10 -

    // 0 2 3 4 5 
    // 1 0 3 4 5
    // 1 2 0 4 5
    // 1 2 3 0 5
    // 1 2 3 4 0

    public static void pattern10(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if(i==j){
                    System.out.print(0+" ");
                }
                else{
                    System.out.print(j+" ");
                }
            }
            System.out.println(" ");
        }
    }

    //     Pattern 11 - 

    // 1 
    // 0 1 
    // 1 0 1
    // 0 1 0 1
    // 1 0 1 0 1

    public static void pattern11(int n){
        for (int row = 1 ; row <= n; row++){
            for(int col = 1 ; col <= row ;col++){
                if((row+col)%2==0){
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }

    // Pattern 12 - 

    // 1 2 3 4 5 5 4 3 2 1 
    // 1 2 3 4     4 3 2 1
    // 1 2 3         3 2 1
    // 1 2             2 1
    // 1                 1
    // 1                 1
    // 1 2             2 1
    // 1 2 3         3 2 1
    // 1 2 3 4     4 3 2 1
    // 1 2 3 4 5 5 4 3 2 1

    public static void pattern12(int n){
        //upper half
        for (int i = n ; i >= 1 ; i--){
            //left numbers 
            for (int j = 1 ; j <= i ; j++){
                System.out.print(j+ " ");
            }
            //space
            for (int s = 1 ; s <= 2*(n-i);s++){
                System.out.print("  ");
            }
            //right numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //lowerhalf
        for (int i = 1 ; i <= n ; i++){
            //left numbers 
            for (int j = 1 ; j <= i ; j++){
                System.out.print(j+ " ");
            }
            //space
            for (int s = 1 ; s <= 2*(n-i);s++){
                System.out.print("  ");
            }
            //right numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    // Pattern 13 - 

    // 1 1 1 1 1 
    // 2 2 2 2 
    // 3 3 3 
    // 4 4
    // 5 

    public static void pattern13(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print(" "+row);
            }
            System.out.println();
        }
    }
}
