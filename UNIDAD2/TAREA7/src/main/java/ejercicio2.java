import java.util.Scanner;
class ejercicio2 {

    public static void main( String[] args ) {

        Scanner teclado = new Scanner(System.in);
        int edad = 30;
        int nivel_de_estudios = 7;
        int ingresos = 30000;

        boolean jasp = (edad <= 28 && nivel_de_estudios > 3 && ingresos > 28000) ? true : false;
        System.out.println("¿jasp?" + jasp);
    }
}