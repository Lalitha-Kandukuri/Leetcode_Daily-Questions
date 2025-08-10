public class isPowerOfTwo {
    public static void main(String[] args) {
        isPowerOfTwo obj = new isPowerOfTwo();
        
        int n = 16;
        System.out.println(obj.sol(n));
    }

    public boolean sol(int n) {
        if (n<=0) {
            return false;
        }

        while (n%2==0) {
            n = n/2;
        }

        return n==1;
    }
}
