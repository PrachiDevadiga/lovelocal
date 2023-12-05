import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MajorityElementFinder {

    public List<Integer> majorityElements(int[] nums) {
        List<Integer> result = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return result;
        }

        int candidate1 = 0, count1 = 0;
        int candidate2 = 1, count2 = 0;

        // Boyer-Moore Majority Vote algorithm
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Count occurrences of candidates
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }

        // Check if candidates appear more than n/3 times
        if (count1 > nums.length / 3) {
            result.add(candidate1);
        }
        if (count2 > nums.length / 3) {
            result.add(candidate2);
        }

        return result;
    }

    public static void main(String[] args) {
        MajorityElementFinder finder = new MajorityElementFinder();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        if((n/3)==0)
        {
            for(int i=0;i<n;i++)
          {
            System.out.print(nums[i]+" ");
            }
        }
        else{
            List<Integer> result = finder.majorityElements(nums);
        System.out.println("Elements appearing more than n/3 times: " + result);
        }
    }
}