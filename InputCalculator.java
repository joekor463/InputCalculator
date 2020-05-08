import java.util.Scanner;

public class InputCalculator {


            public static void main(String arg[]) {
                inputThenPrintSumAndAverage();
            }

            public static void inputThenPrintSumAndAverage(){
            int sum = 0;
            //long average = 0;
            int count = 0;
            Scanner scanner = new Scanner(System.in);

            while(true) {
                System.out.println ("Enter the Number:");
                boolean isAnInt = scanner.hasNextInt ();
                if(isAnInt){
                    int number = scanner.nextInt();
                    sum = sum + number;

                    count = count + 1;
                    //System.out.println ("count - "+ count);
                } else {

                    break;

                }
                scanner.nextLine();
            }
                double average1 = sum / count;
                long average = Math.round ( average1 );
                System.out.println ("Sum = " + sum + " Average = " + average);
            scanner.close();
            }
}

