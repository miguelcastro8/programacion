import java.util.Scanner;
class ejercicio6{

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero positivo: ");
        String num = teclado.nextLine();
        System.out.println("Introduce la posicion por la que quieres separar el numero: ");
        String num1 = teclado.nextLine();

        System.out.println("la primera parte es: " + num.substring(0, Integer.parseInt(num1)));
        System.out.println("la segunda parte es: " + num.substring(Integer.parseInt(num1), num.length()));
    }
}
