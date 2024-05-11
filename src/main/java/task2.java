import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("txt.txt"));
            String line = scanner.nextLine();
            String[] str_nums = line.split(" ");

            int[] num_arr = new int[str_nums.length];
            for (int i = 0; i < str_nums.length; i++) {
                num_arr[i] = Integer.parseInt(str_nums[i]);
            }

            System.out.println(_min(num_arr));
            System.out.println(_max(num_arr));
            System.out.println(_sum(num_arr));
            System.out.println(_mult(num_arr));

            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }
    }

    public static int _min(int[] numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int _max(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int _sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int _mult(int[] numbers) {
        int mult = 1;
        for (int number : numbers) {
            mult *= number;
        }
        return mult;
    }
}
