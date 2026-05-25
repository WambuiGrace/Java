import java.util.Scanner;

class Loops{
    public static void main(String[] args) {
        // For loop
        int word = 5;

        for(int n=1; n<=word; ++n){
            System.out.println(n);
            System.out.println("For loop will run 5 times");
        }
        System.out.println("------------------------------------------------------");

        //For each loop - iterate through arrays and collections
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number: numbers){
            System.out.println(number);
            sum += number;
        }
        System.out.println("Sum: "+sum);
        System.out.println("------------------------------------------------------");

        //While loop
        int k =1, m=7;
        while (k <= m) {
            System.out.println(k);
            k++;
        }

        int sums = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        while (number >= 0) {
            sum += number;
            System.out.println("Enter a number: ");
            number = input.nextInt();
        }
        System.out.println("Sum: "+sum);
        input.close();
        System.out.println("------------------------------------------------------");

        //do-while loop
        int e =1, g =5;
        do{
            System.out.println(e);
            e++;
        } while (e <= g);
    }
}