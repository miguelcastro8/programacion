import java.util.Scanner;
class ejercicio2{

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = teclado.nextInt();


        for (int i = num; i < num + 5; i++) {
            System.out.printf("%4d %6d %8d\n", i, i * i, i * i * i);
        }
    }
}