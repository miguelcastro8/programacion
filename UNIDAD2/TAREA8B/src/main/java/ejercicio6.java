import java.util.Scanner;
class ejercicio6{

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe la altura: ");
        int altura = teclado.nextInt();
        System.out.println("Escribe el caracter: ");
        String relleno = teclado.next();
        int espacioP = altura - 1;
        int espaciosM = 0;
        for (int i = 1; i <= altura - 1; i++) {
            for (int j = 0; j < espacioP; j++) {
                System.out.print(" ");
            }
            System.out.print(relleno);
            for (int j = 1; j < espaciosM; j++) {
                System.out.print(" ");
            }
            if (i > 1) {
                System.out.print(relleno);
            }
            System.out.println();
            espacioP--;
            espaciosM = espaciosM + 2;
        }
        for (int j = 1; j <= espaciosM + 1; j++) {
            System.out.print(relleno);
        }
    }
}