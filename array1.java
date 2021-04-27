import java.util.*;

public class array1 {

    public static void main (String args[]){


        int array1[] = {3,7,2,9,0,1,4,6,2,8};
        int guess = 0;
        int loop = 0;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Type a positive number to find where it is stored: ");
            guess = in.nextInt();

            if (guess < 0 || guess > 10000) {

                System.out.println("Out of range, try again");

            } else {

                for (int i = 0; i < 10; i++) {

                    if (guess == array1[i]) {

                        System.out.println("The number " + guess + " is located at index " + i);
                        break;
                    } else if (i == 9 && guess != array1[i]) {

                        System.out.println("Your number is not in the array.");
                    }
                }
            }

            System.out.println("0 to try again, 1 to quit");
            loop = in.nextInt();
        }while (loop == 0);
    }
}
