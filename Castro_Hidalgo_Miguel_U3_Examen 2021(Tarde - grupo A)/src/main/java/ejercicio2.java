import java.util.Random;
import java.util.Scanner;
class ejercicio2{


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int [][] enteros = new int [4][6];
        for (int i = 0; i < enteros.length; i++){
            for (int j = 0; j < enteros.length; j++){
                int r =(int) Math.random()*20;
            }
        }
        System.out.println(enteros);
    }
}
