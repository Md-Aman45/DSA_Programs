import java.util.*;


public class Test {

    // String...
    public String removeParan(String s) {
        int cnt = 0;
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                if (cnt > 0) {
                    ans.append(ch);
                }
                cnt++;
            }
            else {
                cnt--;
                if (cnt > 0) {
                    ans.append(ch);
                }
            }
        }

        return ans.toString();
    }



    // Array...
    // Easy level...
    // Find the largest element in an arr... 
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the size of arr: ");
    //     int n = sc.nextInt();

    //     int[] arr = new int[n];
    //     System.out.print("Enter " + n + " elements: ");
    //     for (int i = 0; i < n; i++) {
    //         arr[i] = sc.nextInt();
    //     }


    //     // largest..
    //     // int largest = arr[0];
    //     // for (int i = 1; i < n; i++) {
    //     //     if (arr[i] > largest) {
    //     //         largest = arr[i];
    //     //     }
    //     // }



    //     // smallest...
    //     // int smallest = arr[0];
    //     // for (int i = 0; i < n; i++) {
    //     //     if (arr[i] < smallest) {
    //     //         smallest = arr[i];
    //     //     }
    //     // }



    //     // find the sum...
    //     // int sum = 0;

    //     // for (int i = 0; i < n; i++) {
    //     //     sum += arr[i];
    //     // }



    //     // average of arr..
    //     // int avg = 0;
    //     // int sum = 0;

    //     // for (int i = 0; i < n; i++) {
    //     //     sum += arr[i];
    //     // }

    //     // avg = sum / n;


    //     // convert even or odd...
    //     // for (int i = 0; i < n; i++) {
    //     //     if (arr[i] % 2 == 0 ) {
    //     //         arr[i] = arr[i] + 1;   // even -> odd
    //     //     }
    //     //     else {
    //     //         arr[i] = arr[i] - 1;    // odd -> even
    //     //     }
    //     // }




    //     // reverse an array...
    //     // int left = 0;
    //     // int right = n - 1;

    //     // while (left < right) {
    //     //     int temp = arr[left];
    //     //     arr[left] = arr[right];
    //     //     arr[right] = temp;

    //     //     left++;
    //     //     right--;
    //     // }




    //     // sort arr in ascending order...
    //     for (int i = 0; i < n - 1; i++) {
    //         for (int j = 0; j < n - 1 - i; j++) {
    //             if (arr[j] > arr[j + 1]) {
    //                 int temp = arr[j];
    //                 arr[j] = arr[j + 1];
    //                 arr[j + 1] = temp;
    //             }
    //         }
    //     }




    //     // System.out.print("Largest number is: " + largest);
    //     // System.out.print("Smallest number is: " + smallest);
    //     // System.out.print("Sum: " + sum);
    //     // System.out.print("Avg: " + avg);
    //     // System.out.print("even or odd: " + arr);
    //     // System.out.print("reverse: " + Arrays.toString(arr));
    //     System.out.print("sort in asce: " + Arrays.toString(arr));


    //     sc.close();
    // }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter paranthesis string: ");

        String input = sc.next().trim();
        
        Test obj = new Test();
        String result = obj.removeParan(input);

        System.out.print("result: " + result);
    }
}
