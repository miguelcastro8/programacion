import java.util.Scanner;
class ejercicio5{

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame la altura de la piramide: ");
        int altura = teclado.nextInt();

        for (int i=0; i<=altura; i++){
            for (int j=altura-i; j>0; j--){
                System.out.print(" ");
            }
            for (int j=0; j<i; j++){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}