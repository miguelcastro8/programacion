import java.util.Scanner;

class ejercicio4 {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Dame la hora: ");
    int hora = teclado.nextInt();
    System.out.println("Dame los minutos: ");
    int minutos = teclado.nextInt();
    System.out.println("Dame los segundos: ");
    int segundos = teclado.nextInt();
    System.out.println("Introduce el numero de segundos que quieres incrementar: ");
    int incremento = teclado.nextInt();
    System.out.println("Aumentando la hora...");

      for (incremento = segundos; incremento < segundos+5; incremento++) {
          int contar = incremento+1;
          System.out.println(contar);
          }
      }
  }
