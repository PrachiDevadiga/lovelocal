import java.util.Scanner;
public class CountDigitOne {

    public static int countDigitOne(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            count += countOnes(i);
        }

        return count;
    }

    private static int countOnes(int num) {
        int count = 0;

        while (num > 0) {
            if (num % 10 == 1) {
                count++;
            }
            num /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        // Example usage:
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result = countDigitOne(n);
        System.out.println(result);
    }
