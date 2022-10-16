import java.util.ArrayList;
import java.util.Scanner;

class ReWrites {
    private final static Scanner s = new Scanner(System.in);

    public static void avgRewrite() {
        String l;
        double sum = 0.0;
        int count = 0;
        ArrayList<Integer> myList = new ArrayList<>();

        System.out.println("Ths program will calculate the average of numbers entered. Begin entering and enter \"Q\" to quit.");
//        while(!(l = s.nextLine()).toUpperCase().equals("Q")) {
//            try {
//                sum += Integer.parseInt(l);
//                count++;
//            } catch (NumberFormatException nfe) {}
//        }

        // Since the number of inputs is not known ahead, I don't see how we could read the input values within a for loop.
        while(!(l = s.nextLine()).toUpperCase().equals("Q")) {
            try {
                myList.add(Integer.parseInt(l));
            } catch (NumberFormatException nfe) {}
        }
        for (Integer myNumber : myList) {
            sum += myNumber;
        }
//        System.out.printf("Average is: %f%n", (sum/count));
        System.out.printf("Average is: %f%n", (sum/ myList.size()));
    }
    public static void sumRewrite() {
        Scanner in = new Scanner(System.in);
        System.out.println("Type positive integers to sum. To stop, type 0...");
        int x = -1;
        int sum = 0;

        while (x != 0) {
            try {
//                if(x == 0) {
//                    break;
//                }
                x = Integer.parseInt(in.nextLine());
                if (x <= 0) {
                    continue;
                }
                System.out.println("Adding " + x);
                sum += x;
            } catch (NumberFormatException nfe) {}
        }

        System.out.printf("Sum: %d%nGood Bye%n", sum);
    }

    public static void main(String[] args) {
        avgRewrite();
        sumRewrite();
    }
}