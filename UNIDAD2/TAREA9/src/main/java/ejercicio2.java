import java.util.Scanner;

class ejercicio2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una contraseña: ");
        String s1 = teclado.nextLine();


        System.out.println("Intenta adivinar la contraseña: ");
        System.out.println("Su primera letra es: " + s1.charAt(0));
        System.out.println("Su ultima letra es: " + s1.charAt(s1.length()-1));
        System.out.println("Su longitud es: " + s1.length());
        System.out.println("Intenta adivinarla: ");
        String s2 = teclado.nextLine();
        if (s1.equals(s2)){
            System.out.println("Acertaste");
        }
        else{
            System.out.println("fallaste");
        }

    }
}