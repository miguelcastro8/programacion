import java.util.Scanner;
class ejercicio4 {

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce un numero");
        byte numero1 = teclado.nextByte();
        System.out.println("introduce otro numero");
        byte numero2 = teclado.nextByte();

        //if (numero1 < numero2) {
         //System.out.println("El primer numero es menor");
        //}
        //else {
        //System.out.println("El segundo numero es menor");
        //}

        if (numero1 < numero2)
            System.out.println("El primer numero es menor");
        else
            System.out.println("El segundo numero es menor");
        }
    }