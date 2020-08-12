package Data;

public class Factorial {


    public Integer factorial(int value) {
    int result = 1;
    for (int i = 1; i <= value; i++) result *= i;
    return result;
    }
    public int factorial_recursive(int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return n * factorial_recursive(n - 1);
        }
        return n;
    }
}
