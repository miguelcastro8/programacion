import java.util.Scanner;

class millas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print( "introduzca un numero de millas: " );
        int primerNumero = teclado.nextInt();
        System.out.println("el numero de millas que usted a introducido equivale a estos metros:");
        System.out.println(1609*primerNumero);
    }
}