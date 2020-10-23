import java.util.Scanner;

class ejercicio7 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int x = 1;

        do {
            System.out.println( x * x );
            x+=2;
        }
        while (x <= 10);
    }
}