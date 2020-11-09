import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        String frase = sc.nextLine();
        int contador = 0;
        int contador1 = 0;


        String o = "0";
        contador++;
        String a = "8";
        contador1++;

        if(frase.contains(o)){
            contador++;
            System.out.println("la cantidad de ceros que hay en esta frase es: " + contador);
        }
        if(frase.contains(a)){
            contador1++;
            System.out.println("la cantidad de ochos que hay en esta frase es: " + contador1);
        }
    }
}