class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(9));
    }

    public static int factorial(int numero) {
        int total = 1;
        for (int i = 1; i <= numero; i++) {
            total *= i;
        }
        return total;
    }
}
