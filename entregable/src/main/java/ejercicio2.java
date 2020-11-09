import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa un numero positivo: ");
        int numero=teclado.nextInt();
        int cifra;
        long num_pares=0, num_impares=0;

        while (numero>0){
            cifra=(numero%10);
            if (cifra%2==0){
                num_pares++;
            }
            else{
                num_impares++;
            }

            numero=numero-cifra;

            numero=numero/10;
        }

        System.out.println("Cantidad de numeros pares: " + num_pares);

        System.out.println("Cantidad de numeros impares: " + num_impares);
    }
}