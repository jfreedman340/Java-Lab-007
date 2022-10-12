/**
 * @author Trevor Hartman
 *
 * @author Joseph Freedman
 *
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WhileLoops {

    public static void eoCount(ArrayList<Integer> numList) {
        int even=0, odd=0;
        for(int num : numList) {
            if(num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.printf("Even Count is %d%nOdd Count is %d%n", even, odd);
    }

    public static double mean(ArrayList<Integer> numList) {
        double sum = 0.0;

        for(int num : numList) {
            // add list values with sum variable one-by-one.
            sum += num;
        }
        double mean = sum / numList.size();
        System.out.printf("The mean is: %f", mean);
        return mean;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Numbers: ");
        ArrayList<Integer> numList = new ArrayList<Integer>();
        String l;
        while(!(l = s.nextLine()).equalsIgnoreCase("Q")) {
            try {
                numList.add(Integer.parseInt(l));
            } catch(NumberFormatException nfe) {}
            System.out.println("Enter Numbers: ");
        }

        eoCount(numList);
        double myMean = mean(numList);
    }
}
