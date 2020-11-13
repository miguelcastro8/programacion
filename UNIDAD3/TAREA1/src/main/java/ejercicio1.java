import java.util.Scanner;
class ejercicio1{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero: ");
        int num = sc.nextInt();

        for (int i=0; i<=num; i++){
            System.out.println("eco");
        }
    }
}