// Problem : Add all even numbers from 0 to 100

public class SumEven{
    public static void main(String[] args){
        //declaration of sum variable
        int sum = 0;
        // for loop for iterating num 1 to 100
        for (int num = 1 ; num <= 100 ; num++){
            // checking if the number is divisible by 2 (Even Number)
            if(num%2==0){
                // Adding all even numbers
                sum = sum + num;
            }
        }
        // displayin the result
        System.out.println("Sum of even numbers is "+sum); //2550
    }
}