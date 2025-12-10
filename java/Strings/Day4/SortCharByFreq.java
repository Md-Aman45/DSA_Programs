package Day4;
import java.util.*;

public class SortCharByFreq {
    public String frequencySort(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        List<List<Character>> buckets = new ArrayList<>();
        for (int i = 0; i <= s.length(); i++) {
            buckets.add(new ArrayList<>());
        }


        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            char ch = entry.getKey();
            int f = entry.getValue();
            buckets.get(f).add(ch);
        }



        StringBuilder ans = new StringBuilder();

        for (int f = s.length(); f >= 1; f--) {
            for (char ch : buckets.get(f)) {
                ans.append(String.valueOf(ch).repeat(f));
            }
        }

        return ans.toString();
    }



    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        SortCharByFreq obj = new SortCharByFreq();
        String result = obj.frequencySort(s);

        System.out.println("Sorted by frequency: " + result);




        sc.close();
    }
}