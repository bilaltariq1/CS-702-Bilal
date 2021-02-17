public class Euclid {

    // recursive implementation
    public static int gcd1(int p, int q) {
        if (q == 0) return p;
        else return gcd1(q, p % q);
    }

    // non-recursive implementation
    public static int gcd2(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }

    public static void main(String[] args) {
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);
        // int p = 10;
        // int q = 29;
        int d  = gcd1(p, q);
        int d2 = gcd2(p, q);
        StdOut.println("With Recursion");
        StdOut.println("gcd1(" + p + ", " + q + ") = " + d);
        StdOut.println("Without Recursion");
        StdOut.println("gcd2(" + p + ", " + q + ") = " + d2);
    }
}
