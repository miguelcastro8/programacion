import java.util.Scanner;

class centigrados {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print( "introduzca un numero de grados centigrados: " );
        int primerNumero = teclado.nextInt();
        System.out.println("estos grados centigrados equivalen a estos grados fahrenheit:");
        System.out.println((primerNumero*9/5)+32);
    }
}