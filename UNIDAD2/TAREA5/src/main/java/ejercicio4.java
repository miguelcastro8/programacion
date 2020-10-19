import java.util.Scanner;
class ejercicio4 {

    public static void main (String args[]){
    Scanner teclado = new Scanner(System.in);

        System.out.println("Dame un numero entero");
        int entero1 = teclado.nextInt();

        if (entero1%2==0){
            System.out.println("el primer numero es par");
        }
        else{
            System.out.println("El primer numero es par");
        }

        System.out.println("Dame otro numero entero");
        int entero2 = teclado.nextInt();

        if (entero2%2==0){
        System.out.println("El segundo numero es par");
        }
        else{
        System.out.println("El segundo numero no es par");
        }
    }
}