import java.util.Scanner;

class division1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print( "introduzca un numero: " );
        int primerNumero = teclado.nextInt();
        System.out.print( "introduzca otro numero: " );
        int segundoNumero = teclado.nextInt();

        System.out.print( "Su division daria como resultado: " );
        System.out.println( primerNumero/segundoNumero );
    }
}