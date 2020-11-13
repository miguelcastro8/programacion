import java.util.Scanner;
class ejercicio4{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num1=sc.nextInt();
        System.out.println("Introduce otro numero: ");
        int num2=sc.nextInt();

        if (num1>num2){
            System.out.println("El numero mayor es el " + num1);
        }
        else{
            System.out.println("El numero mayor es el " + num2);
        }
    }
}