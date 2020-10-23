import java.util.Scanner;

class ejercicio5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el dato minimo del rango: ");
        int min = teclado.nextInt();
        System.out.println("Introduce el dato maximo del rango: ");
        int max = teclado.nextInt();
        System.out.println("Introduce un dato intermedio: ");
        int medio = teclado.nextInt();

        while (medio>max || medio<min){
            System.out.println("Este numero no es intermedio, introduce un nuevo numero: ");
            medio = teclado.nextInt();
        }
    }
}
