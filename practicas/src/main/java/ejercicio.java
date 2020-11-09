import java.util.Scanner;
class ejercicio {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la altura de los calcetines: ");
        int altura = teclado.nextInt();
        while (altura < 4) {
            System.out.print("La altura debe ser mayor o iguel a 4: ");
            altura = teclado.nextInt();
        }
        System.out.println("Muy bien, comenzemos!!");

        for (int i=1; i<=altura; i++){
            if (i<=altura-2){
                for (int j=1; j<=3; j++){
                    System.out.println("*");
                }
                for (int j=1; j<=5; j++){
                    System.out.println(" ");
                }
                for (int j=1; j<=3; j++){
                    System.out.println("*");
                }
                System.out.println();
            }
            else{
                for (int j=1; j<=6; j++){
                    System.out.println("*");
                }
                for (int j=1; j<=2; j++){
                    System.out.println(" ");
                }
                for (int j=1; j<=6; j++){
                    System.out.println("*");
                }
                System.out.println();
            }
        }
    }
}