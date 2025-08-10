import java.util.*;

public class reorderedPowerOf2 {
    public static void main(String[] args) {
        reorderedPowerOf2 obj = new reorderedPowerOf2();

        int n = 812;
        System.out.println(obj.sol(n));
    }

    public boolean sol(int n) {
        String sortedN = sortDigits(n);

        for (int i=1; i<=1_000_000_000; i*=2) {
            if (sortedN.equals(sortDigits(i))) {
                return true;
            }
        }
        return false;
    }

    public String sortDigits(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);
        return new String(digits);
    }
}
