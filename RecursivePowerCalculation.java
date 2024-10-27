public class RecursivePowerCalculation {

    public static void main(String[] args) {

        Integer powerOfBase = powerN(4, 2);
        System.out.println(powerOfBase);
    }

    public static int powerN(Integer base, Integer exponent) {

        if (exponent == 1) {
            return base;
        } else {
            base = base * powerN(base, exponent - 1);
        }
        return base;
    }
}
