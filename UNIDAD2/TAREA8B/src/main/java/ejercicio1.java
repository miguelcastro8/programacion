import java.util.Scanner;
class ejercicio1{

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la contraseña de la caja fuerte: ");
        int num=teclado.nextInt();

        while(num != 1234){
            System.out.println("Lo siento, esa no es la combinación");
            num=teclado.nextInt();
        }
        System.out.println("La caja fuerte se ha abierto satisfactoriamente");
    }
}