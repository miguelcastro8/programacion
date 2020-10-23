import java.util.Scanner;

class ejercicio6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int lista;
        int multiplo;
        int i;

        System.out.print("¿De qué número quieres los múltiplos?: ");
        multiplo = teclado.nextInt();

        System.out.print("¿Hasta qué número quieres la lista?: ");
        lista = teclado.nextInt();

        for (i=1; i <=lista; i++) {

            if (i % multiplo == 0)
                System.out.println(i);

        }
    }
}