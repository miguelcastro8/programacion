import java.util.Scanner;
class ejercicio3 {

    public static void main( String args[] ) {

        System.out.println("introduce un numero entero: ");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();

        if (numero % 1 == 0) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
        }
    }