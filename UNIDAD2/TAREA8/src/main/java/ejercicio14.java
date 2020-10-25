import java.util.Scanner;

class ejercicio14 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("inrtoduce un numero de lados: ");
        int numero = teclado.nextInt();

        for(int j=numero; j>0; j--) {
            for(int i=0; i<j; i++) {
                System.out.print( "*" );
            }
            System.out.println();
        }
    }
}