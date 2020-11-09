import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una cadena de texto: ");
        String frase = sc.nextLine();
        int contador = 0;


        String h = "h";
        String o = "o";
        String e = "e";
        String a = "a";


        for (int i = 0; i <= frase.length(); i++) {
            for (int b = 0; b <= i; b++) {
                String car = frase.substring(b, Integer.parseInt(a));



                if (car.equals(h)) {
                    contador++;
                } else if (car.equals(o)) {
                    contador++;
                } else if (car.equals(a)) {
                    contador++;
                } else if (car.equals(e)) {
                    contador++;
                } else if (car.equals(" ")) {
                    contador++;
                }
            }
        }
        System.out.println("La cantidad de espacios, haches y vocales abiertas es " + contador);
    }
}