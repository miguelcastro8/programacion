import java.util.Scanner;

class ejercicio2 {

    public static void main( String[] args ) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una edad: ");
        int edad = teclado.nextInt();
        int suma_edad = edad++;

        while (edad > 0) {
            System.out.print("muy bien, vuelve a introducir otra edad: " + edad);
            edad = teclado.nextInt();
        }
        System.out.println("fin!");
        System.out.println("La suma de las edades es: ");
    }
}
