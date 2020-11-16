import java.util.Scanner;
class ejercicio1{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double[] numeros = {1.6,2.5,7.6,4.6,9.2};

        for (int i = 0; i<numeros.length; i++){
            System.out.println("El digito " + i + " es: " + numeros[i]);
        }
    }
}
