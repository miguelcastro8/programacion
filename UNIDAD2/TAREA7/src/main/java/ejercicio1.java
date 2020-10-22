import java.util.Scanner;
class ejercicio1 {

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        int A;
        int B;
        int AUX;
        System.out.println("introduce una letra: ");
        A = teclado.nextInt();
        System.out.println("introduce otra letra: ");
        B = teclado.nextInt();

        System.out.println("Valores iniciales: A = " + A + " B = " + B);

        AUX = A +B;
        A = AUX - A;
        B = AUX - B;

        System.out.println("Valores cambiados: A = " + (A + B - A) + " B = " + (A + B - B));
    }
}