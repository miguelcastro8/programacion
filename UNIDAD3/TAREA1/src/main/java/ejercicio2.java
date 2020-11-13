import java.util.Scanner;
class ejercicio2{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int a = sc.nextInt();
        System.out.println("Introduce otro numero: ");
        int b = sc.nextInt();

        for (int i = a+1; i < b; i++){
            System.out.println(i);
        }
    }
}