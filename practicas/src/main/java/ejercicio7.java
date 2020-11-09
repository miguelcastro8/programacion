import java.util.Scanner;
class ejercicio7{

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        String num1 = teclado.nextLine();
        String s1 = "1, 2, 3, 4, 5, 6, 7, 8, 9, 0";

        if (num1.contains(s1)){
            System.out.println("Este numero contiene: " + s1);
        }
    }
}