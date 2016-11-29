/**
 * Created by Praktika on 29.11.2016.
 */
public class exercise69 {
    public static void main(String[] args) {
        double x = 10.5;
        int n = 3;
        System.out.print("astendamise vastus on: " + power(x, n));
    }
    public static double power(double x, int n) {
        if(n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1);
        }
    }
}
