class ejercicio5 {

    public static void main (String args[]){
    System.out.println("dame un numero entero largo: ");
    long num1 = 1;
    System.out.println("dame otro numero entero largo: ");
    long num2 = 2;
    System.out.println("dame un tercer numero entero largo: ");
    long num3 = 3;
    }

    if (num1 > num2 && num1 > num3){
    System.out.println("num1 es el mayor");
    }
    if (num2 > num1 && num2 > num3){
    System.out.println("num2 es el mayor");
    }
    else if (num3 > num1 && num3 > num2){
    System.out.println("num3 es el mayor");
    }
}