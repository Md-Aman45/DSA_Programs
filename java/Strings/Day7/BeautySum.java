package Day7;
import java.util.*;

public class BeautySum {
    public int getMinCnt(int[] freq) {
        int minCnt = Integer.MAX_VALUE;

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                minCnt = Math.min(minCnt, freq[i]);
            }
        }
        return minCnt;
    }


    public int getMaxCnt(int[] freq) {
        int maxCnt = 0;

        for (int i = 0; i < 26; i++) {
            maxCnt = Math.max(maxCnt, freq[i]);
        }

        return maxCnt;
    }


    public int beautySum(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26];

            for (int j = i; j < s.length(); j++) {
                freq[s.charAt(j) - 'a']++;

                int beauty = getMaxCnt(freq) - getMinCnt(freq);

                sum += beauty;
            }
        }
        return sum;
    }


    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();

        BeautySum obj = new BeautySum();
        int result = obj.beautySum(s);

        System.out.println("Beauty Sum: " + result);
        sc.close();
    }
}
