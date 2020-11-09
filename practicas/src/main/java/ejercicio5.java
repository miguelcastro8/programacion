import java.util.Scanner;
class ejercicio5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la altura de los calcetines: ");
        int altura = teclado.nextInt();
        while (altura < 5) {
            System.out.print("La altura debe ser mayor o iguel a 5: ");
            altura = teclado.nextInt();
        }
        System.out.println("Muy bien, comenzemos!!");

        for (int i=1; i<=altura; i++){
            if (i<=altura){
                for (int j=1; j<=altura; j++){
                    System.out.println("M");
                }
            }
        }
    }
}
