import java.util.Scanner;
class ejercicio5 {

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce un radio");
        int radio = teclado.nextInt();
        System.out.println("introduce un numero");
        int numero = teclado.nextInt();
        int pi = 3;

        if (numero == 1);{
            System.out.println("El diametro es: " + 2 * radio);
        }

        if (numero == 2);{
            System.out.println("El perimetro es: " + 2 * pi * radio);
        }

        if (numero == 3);{
            System.out.println("El area es: " + pi * radio * radio);
        }

        switch(numero) {
            case 1: System.out.println( "calcular diametro" ); break;
            case 2: System.out.println( "calcular perimetro" ); break;
            case 3: System.out.println( "calcular area" ); break;
            default: System.out.println("caso desconocido"); break;
        }
    }
}