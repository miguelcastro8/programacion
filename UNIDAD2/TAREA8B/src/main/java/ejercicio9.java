import java.util.Scanner;
class ejercicio9{

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la altura de la letra L por pantalla: ");
        int altura = teclado.nextInt();

        for (int i=0; i<altura; i++){
            System.out.println("*");
        }
        for (int i=0; i < ((altura/2)+1); i++){
            System.out.print("* ");
        }
    }
}
