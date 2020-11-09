import java.util.Scanner;

public class ejercicio3 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Por favor, introduzca un número entero nuevo: ");
    String num = sc.next();
    System.out.println("Introduce la cifra que quieres insertar dentro del numero: ");
    String cifra = sc.next();
    System.out.println("Introduce la posición donde quieres insertar un nuevo numero: ");
    int posicion = sc.nextInt();


    String s1=num.substring(0,posicion);

    String s2=num.substring(posicion);

    String s3=s1+cifra+s2;


    System.out.println(s3);

  }
}
