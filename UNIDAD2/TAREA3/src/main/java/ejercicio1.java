import java.util.Scanner;

class ejercicio1 {

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca el primer número: " );
        byte primerNumero = teclado.nextByte();
        System.out.print( "Introduzca el segundo número: " );
        byte segundoNumero = teclado.nextByte();

        System.out.print( "Su suma es: " );
        System.out.println( primerNumero+segundoNumero );
    }
}
