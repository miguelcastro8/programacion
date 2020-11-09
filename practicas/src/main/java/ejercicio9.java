import java.util.Scanner;
class ejercicio9{

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Inrtoduce tu primera nota: ");
        int nota1 = teclado.nextInt();
        System.out.println("Introduce tu segunda nota: ");
        int nota2 = teclado.nextInt();
        int recuperacion = 0;

        if ((nota1+nota2)/2 >= 5 && (nota1+nota2)/2 < 6){
            System.out.println("Suficiente");
        }
            else if((nota1+nota2)/2 >=6 && (nota1+nota2)/2 < 7){
            System.out.println("Bien");
        }
            else if((nota1+nota2)/2 >=7 && (nota1+nota2)/2 < 9){
                System.out.println("Notable");
        }
            else if((nota1+nota2)/2 >= 9){
                System.out.println("Sobresaliente");
        }

        if(nota1 < 5){
            System.out.println("¿Cual es tu nota de recuperacion?: ");
            recuperacion = teclado.nextInt();
        }
            else if (nota2 < 5){
            System.out.println("¿Cual es tu nota de recuperacion?: ");
            recuperacion = teclado.nextInt();
        }

        if (recuperacion >= 5){
            System.out.println("Suficiente");
        }
        else{
            System.out.println("Suspenso");
        }
    }
}