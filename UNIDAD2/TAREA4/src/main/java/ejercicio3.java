import java.text.NumberFormat;
import java.util.Scanner;

class ejercicio3 {

    public static void main( String args[] ) {

        Scanner teclado;
        float Num1, Num2, Num3;

        teclado = new Scanner(System.in);
        System.out.print( "Introduzca la primera nota: " );
        Num1 = teclado.nextFloat();
        System.out.print( "Introduzca la segunda nota: " );
        Num2 = teclado.nextFloat();
        System.out.print( "Introduzca la tercera nota: " );
        Num3 = teclado.nextFloat();


        System.out.print( "Su media aritmetica es: " );
        System.out.println(Math.round(Num1+Num2+Num3)/3);
    }
}