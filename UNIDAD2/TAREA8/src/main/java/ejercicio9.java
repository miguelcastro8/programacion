import java.util.Scanner;

class ejercicio9 {

    public static void main( String[] args ) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una altura de arbol: ");
        int altura = teclado.nextInt();

        while (altura > 0) {
            System.out.print("muy bien, vuelve a introducir otra edad: ");
            altura = teclado.nextInt();
        }
        System.out.println("fin!");
    }
}
