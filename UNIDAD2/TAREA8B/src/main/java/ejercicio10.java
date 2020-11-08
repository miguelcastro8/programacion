import java.util.Scanner;
class ejercicio10{

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la altura de la letra U por pantalla: ");
        int altura = teclado.nextInt();

        for (int i = 1; i < altura; i++){
            for (int j = 1; j <= altura; j++){
                if ((j == 1) || (j == altura)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i < altura; i++){
            if ((i == 1) || (i == altura)){
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
    }
}