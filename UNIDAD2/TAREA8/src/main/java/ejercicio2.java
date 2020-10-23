import java.util.Scanner;

class ejercicio2 {

    public static void main( String[] args ) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una edad: ");
        int edad = teclado.nextInt();

        while (edad > 0) {
            System.out.print("muy bien, vuelve a introducir otra edad: " + edad);
            edad = teclado.nextInt();
        }
        System.out.println("fin!");
    }
}
