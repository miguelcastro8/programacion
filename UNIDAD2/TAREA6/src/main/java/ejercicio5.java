import java.util.Scanner;
class ejercicio5 {

    public static void main( String args[] ) {

        System.out.println("introduce un numero");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        switch(numero) {
            case 1: System.out.println( "calcular diametro" ); break;
            case 2: System.out.println( "calcular perimetro" ); break;
            case 3: System.out.println( "calcular area" ); break;
        }
    }
}