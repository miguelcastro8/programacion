import java.util.Scanner;
class ejercicio3{

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = teclado.nextInt();
        int num1=0;
        int num2 = 1;

        for (int i=1; i<=num; i++){
            int t2 = num1;
            num1=num2+num1;
            num2=t2;
            System.out.println(num2);
        }
    }
}