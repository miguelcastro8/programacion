import java.util.Scanner;

public class ejercicio4 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un numero aleatorio: ");
    int numero = teclado.nextInt();
    int es_primo = 0;
    int a = 0;
    int b = 0;

    for (a = numero; a < numero+5; a++) {
      int contar = 0;

      for (b=1; b<=a; b++) {
        if ((a%b) == 0) {
          contar++;
        }
      }
      if(contar<=2){
        System.out.println(a + " es un numero primo");
        es_primo++;
      } else {
        System.out.println(a + " en este caso no es un numero primo");
      }
    }
  }
}