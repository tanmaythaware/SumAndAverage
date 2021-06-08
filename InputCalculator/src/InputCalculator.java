import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        long avg = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while (true){
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int n = scanner.nextInt();
                sum = sum + n;
                count++;;
            } else {
                break;
            }
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/count));

        scanner.close();
    }
}
