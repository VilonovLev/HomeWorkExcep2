import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    static Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) {
        float input = inputFloat();

        int[] arr = {1,2,30};
        logger.info(String.valueOf(divisionElement(arr,1,2)));

        printSum(123, 2342);

        setName();
    }

    // Задача 1
    public static float inputFloat() {
        Scanner scanner = new Scanner(System.in);
        do {
            String result = scanner.next();
            if (isFloat(result))
                return Float.parseFloat(result);
            logger.info("incorrect input");
        } while (true);
    }

    public static boolean isFloat(String string) {
        return (string.matches("(^-?\\d+(\\.\\d+(d?|f?))?)"));
    }

    // Задача 2
    public static double divisionElement(int[] arr, int index, int divide) {
       if (arr == null) {
           return 4.10001;
       } else if (index >= arr.length || index < 0) {
           return 4.20002;
       }
       return (double) arr[index] / divide;
    }

    // Задача 3
    public static double divide(int first , int second) {
        return (double) first / second;
    }

    public static boolean setElement(int[] arr, int index, int element) {
        if (arr == null) {
            logger.info("array is null");
            return false;
        } else if (index >= arr.length || index < 0) {
            logger.info("index no correct");
            return false;
        }
        arr[index] = element;
        return true;
    }

    public static void printSum(Integer a, Integer b) {
        if (a == null || b == null) {
            logger.info("argument no correct");
            return;
        } else if ((long) a + b != a + b) {
            logger.info("type overflow");
            return;
        }
        System.out.println(a + b);
    }

    // Задача 4
    private static String setName() {
        System.out.println("Hello, please enter your name:");
        String name = new Scanner(System.in).nextLine();
        if (name.trim().length() == 0) {
            try {
                throw new RuntimeException("Don't input void Name!!!");
            }
            catch (RuntimeException e) {
                logger.info(e.getMessage());
                setName();
            }
        }
        return name;
    }

}