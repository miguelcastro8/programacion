import java.util.Scanner;
class ejercicio3{

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce tus 3 numeros favoritos: ");
    String favorito = teclado.nextLine();


    System.out.println("Dime un numero de loteria: ");
    String loteria = teclado.nextLine();

    if(loteria.contains(favorito) ){
      System.out.println("Usted va a tener suerte");
    }
    else{
      System.out.println("Usted no va a tener suerte");
    }
  }
}