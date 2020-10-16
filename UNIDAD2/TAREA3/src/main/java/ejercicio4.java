import java.util.Scanner;

class ejercicio4 {

    public static void main( String args[] ) {

        Scanner teclado;
        float Numero1;
        float myNum = 1609f;

        teclado = new Scanner(System.in);
        System.out.print( "Introduzca un primer número de millas: " );
        Numero1 = teclado.nextFloat();

        System.out.print( "Su division es: " );
        System.out.println( 1609*Numero1 );
    }
}