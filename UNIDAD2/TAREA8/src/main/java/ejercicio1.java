import java.util.Scanner;

class ejercicio1 {

    public static void main( String[] args ) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();
        int cuadrado = numero * numero;

        if (numero / 2 == 0){
            System.out.println("es par");
        }
        else{
            System.out.println("no es par");
        }

        if (numero > 0){
            System.out.println("es positivo");
        }
        else{
            System.out.println("es negativo");
        }

        System.out.println("El cuadrado de su numero es: " + cuadrado);

        while (numero != 0) {
            System.out.print("muy bien: ");
            numero = teclado.nextInt();
        }
        System.out.println("fin!");
    }
}