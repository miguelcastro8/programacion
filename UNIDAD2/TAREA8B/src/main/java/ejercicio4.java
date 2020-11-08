import java.util.Scanner;
class ejercicio4{

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        int negativos=0;
        int positivos=0;

        for (int i=1; i<=10; i++){
            System.out.println("Introduce tus 10 numeros favoritos: ");
            int num = teclado.nextInt();

            if (num<0){
                negativos++;
            }
            if (num>=0){
                positivos++;
            }
        }
        System.out.println("Hay" + positivos +  "positivos");
        System.out.println("Hay" + negativos +  "negativos");
    }
}