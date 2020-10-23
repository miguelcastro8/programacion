import java.util.Scanner;

class ejercicio13 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int suspensos = 0;
        int aprobados = 0;
        int condicionados = 0;

        for (int i=1; i<=6; i++){
            System.out.println("Introduce tus calificaciones: ");
            int n = teclado.nextInt();

            if (n<5){
                suspensos++;
            }
            if (n>=5){
                aprobados++;
            }
            if (n==4){
                condicionados++;
            }

            System.out.println("hay " + suspensos + " suspensos.");
            System.out.println("hay " + aprobados + " aprobados.");
            System.out.println("hay " + condicionados + " condicionados.");
        }
    }
}
