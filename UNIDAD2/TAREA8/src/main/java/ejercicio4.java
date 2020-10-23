import java.util.Scanner;

class ejercicio4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número entero: ");
        n = teclado.nextInt();
        System.out.println("\nNumeros del 1 al " + n + ": ");
        int i = 1;
        while (i <= n){
            System.out.println(i);
            i++;
        }
    }
}