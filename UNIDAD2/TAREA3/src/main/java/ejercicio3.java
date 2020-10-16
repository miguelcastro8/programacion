import java.util.Scanner;

class ejercicio3 {

    public static void main( String args[] ) {

        Scanner teclado;
        float Numero1, Numero2;

        teclado = new Scanner(System.in);
        System.out.print( "Introduzca un primer número real: " );
        Numero1 = teclado.nextFloat();
        System.out.print( "Introduzca otro segundo número real: " );
        Numero2 = teclado.nextFloat();

        System.out.print( "Su division es: " );
        System.out.println( Numero1/Numero2 );
    }
}