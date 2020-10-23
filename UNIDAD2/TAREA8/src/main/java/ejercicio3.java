import java.util.Scanner;

class ejercicio3 {

    public static void main( String[] args ) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("¿que numero saldra entre 1 y 100? ");
        int adivina = teclado.nextInt();
        int numero_aleatorio = (int) Math.floor(Math.random() * 100+1);

        do {
            if (numero_aleatorio < adivina) ;
            {
                System.out.println("Es menos. intentalo de nuevo: " + numero_aleatorio);
                adivina = teclado.nextInt();
            }
            if (numero_aleatorio > adivina) ;
            {
                System.out.println("Es mayor.intentalo otra vez");
                adivina = teclado.nextInt();
            }
            if (numero_aleatorio==adivina); {
                System.out.println("Es iguel al numero aleatorio");
                adivina = teclado.nextInt();
            }
        }
        while (adivina != -1 || numero_aleatorio != adivina) ;
    }
}
