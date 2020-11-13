import java.util.Scanner;
class ejercicio3{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = sc.nextInt();
        int pi = 3;

        switch(num) {
            case 1:
                System.out.println("Introduce el radio: ");
                int r = sc.nextInt();
                System.out.println("Inrtoduce la altura: ");
                int h = sc.nextInt();
                int resultado = 2*pi*r(h+r);
                System.out.println("El area total es: " + resultado);
            case 2:
                System.out.println("Introduce el radio: ");
                int radio = sc.nextInt();
                System.out.println("Inrtoduce la altura: ");
                int altura = sc.nextInt();
                int resultado1 = pi*radio*radio*altura;
                System.out.println("El area total es: " + resultado1);
        }
    }

    private static int r(int r) {
        return 0;
    }
}