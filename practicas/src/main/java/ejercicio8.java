import java.util.Scanner;
class ejercicio8{

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto: ");
        String s1 = teclado.nextLine();

        int contador = 0;


        String u = "u";
        String o = "o";
        String e = "e";
        String a = "a";
        String i = "i";


        for (int j = 0; j <= s1.length(); j++) {
            for (int b = 0; b <= j; b++) {
                String car = s1.substring(b, Integer.parseInt(String.valueOf(j)));



                if (car.equals(u)) {
                    contador++;
                } else if (car.equals(o)) {
                    contador++;
                } else if (car.equals(a)) {
                    contador++;
                } else if (car.equals(e)) {
                    contador++;
                } else if (car.equals(i)) {
                    contador++;
                }
            }
        }
        System.out.println("La cantidad de vocales es: " + contador);
    }
}
