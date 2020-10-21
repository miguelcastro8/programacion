import java.util.Scanner;
class ejercicio2 {

    public static void main( String args[] ) {

        System.out.println("introduce un numero");
        Scanner teclado = new Scanner(System.in);
        int mes = teclado.nextInt();
        switch(mes) {
            case 1: System.out.println( "El numero es uno" ); break;
            case 2: System.out.println( "El numero es dos" ); break;
            case 3: System.out.println( "El numero es tres" ); break;
            case 4: System.out.println( "El numero es cuarto" ); break;
            case 5: System.out.println( "El numero es cinco" ); break;
            case 6: System.out.println( "El numero es seis" ); break;
            case 7: System.out.println( "El numero es siete" ); break;
            case 8: System.out.println( "El numero es ocho" ); break;
            case 9: System.out.println( "El numero es nueve" ); break;
            case 10: System.out.println( "El numero es diez" ); break;
        }
    }
}
