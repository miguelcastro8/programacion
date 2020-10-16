import java.util.Scanner;

class ejercicio2 {

        public static void main( String args[] ) {

        short nacimiento;
        short actual;

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca tu año de nacimiento: " );
        nacimiento=teclado.nextShort();
        System.out.print( "Introduzca el año actual: ");
        actual=teclado.nextShort();

        System.out.println("Actualmente tienes " +(actual-nacimiento)+" años.");
    }
}