import java.util.Scanner;
class ejercicio7{

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = teclado.nextInt();
        int resto = 0;
        int invertido = 0;

        while (num > 0){
            resto = num % 10;
            invertido = invertido * 10 + resto;
            num /= 10;
        }
        System.out.println("El numero invertido quedaria asi: " + invertido);
    }
}
