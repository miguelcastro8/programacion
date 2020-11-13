import java.util.Scanner;
class ejercicio5{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num1=sc.nextInt();
        System.out.println("Introduce otro numero: ");
        int num2=sc.nextInt();
        System.out.println("introduce un tercer numero: ");
        int num3=sc.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println("El numero mayor es el " + num1);
        }
        else if (num2>num1 && num2>num3){
            System.out.println("El numero mayor es el " + num2);
        }
        else{
            System.out.println("El numero mayor es el " + num3);
        }
    }
}