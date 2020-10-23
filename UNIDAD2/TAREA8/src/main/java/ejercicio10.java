import java.util.Scanner;

class ejercicio10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();

        while (numero < 10) {
            System.out.println("Tabla del " + numero);
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " * " + i + " = " + numero * i);
            }
        }
    }
}
