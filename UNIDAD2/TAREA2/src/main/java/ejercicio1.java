import java.util.Scanner;

class Suma3 {

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        System.out.print( "introduzca un numero: " );
        int primerNumero = teclado.nextInt();
        System.out.print( "introduzca otro numero: " );
        int segundoNumero = teclado.nextInt();

        System.out.print( "Su multiplicacion es es: " );
        System.out.println( primerNumero*segundoNumero );
    }
}