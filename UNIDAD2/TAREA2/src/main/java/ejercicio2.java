import java.util.Scanner;

class division {

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        System.out.print( "introduzca un numero: " );
        int primerNumero = teclado.nextInt();
        System.out.print( "introduzca otro numero: " );
        int segundoNumero = teclado.nextInt();

        System.out.print( "Su resto al dividirlos es: " );
        System.out.println( primerNumero%segundoNumero );
    }
}
