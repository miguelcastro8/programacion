import java.text.NumberFormat;
import java.util.Scanner;

class ejercicio4 {

    public static void main( String args[] ) {

        Scanner teclado;
        float Num1;

        teclado = new Scanner(System.in);
        System.out.print( "Introduzca un numero: " );
        Num1 = teclado.nextFloat();

        System.out.print( "Su redondeo es: " );
        System.out.println(Math.round(Num1));
    }
}