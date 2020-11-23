import java.util.Scanner;
class ejercicio9{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero entero: ");
        int n1 = sc.nextInt();
    }
    public static boolean divisoresprimos(int n1){
        boolean es_primo = true;

        for (int i=2; i< n1; i++){
            if(n1 % i == 0) {
                es_primo = false;
                break;
            }
        }
        return es_primo;
    }
    public static int numero_primo(int n1){
        int contador_divisores_primos = 0;

        for (int i = 1; i <= n1; i++){
            if (n1 % i == 0 && divisoresprimos(i)){
                contador_divisores_primos++;
            }
        }
        return contador_divisores_primos;
    }
}
