import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxLengthSubstring {

    public static int findMaxLength(String s) {
        Map<Integer, Integer> balanceMap = new HashMap<>();
        balanceMap.put(0, -1);
        int maxLength = 0;
        int balance = 0;

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '1') {
                balance++;
            } else if (s.charAt(i) == '0') {
                balance--;
            }

            if (balanceMap.containsKey(balance)) {
                maxLength = Math.max(maxLength, i - balanceMap.get(balance));
            } else {
                balanceMap.put(balance, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int maxLength = findMaxLength(s);
        if (maxLength == 0) {
            System.out.println(-1);
        } else {
            System.out.println(s.length() - maxLength);
        }

        scanner.close();
    }
}
