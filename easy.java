import java.util.Scanner;
public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        // Split the string into words
        String[] words = s.split(" ");

        // Check if there are any words
        if (words.length == 0) {
            return 0;
        }

        // Return the length of the last word
        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        // Example usage:
        Scanner sc=new Scanner(System.in);
        String inputString =new String();
        inputString=sc.nextLine();
        int result = lengthOfLastWord(inputString);
        System.out.println(result);
    }
}