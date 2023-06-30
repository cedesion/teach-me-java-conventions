package powerpackage;

public class powerfinder {
    public static int of(int base, int exponent) {
        int num = 1;
        for (int i = 0; i<exponent; i++) {
            num *= base;
        }
        return num;
    }
}
