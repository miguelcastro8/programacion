import java.util.Scanner;

class ejercicio12 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int suspensos = 0;

        for (int i=1; i<=5; i++){
            System.out.println("Introduce tus calificaciones: ");
            int n = teclado.nextInt();

            if (n<5){
                suspensos++;
            }

            System.out.println("hay " + suspensos + " suspensos.");
        }
    }
}
