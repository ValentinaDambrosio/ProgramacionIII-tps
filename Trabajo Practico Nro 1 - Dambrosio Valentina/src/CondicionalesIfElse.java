import java.util.Scanner;

public class CondicionalesIfElse {
    public static void main(String[] args) {
    //Ejercicio 7
        System.out.println("Ingrese un número entero: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        if (numero % 2 == 0){
            System.out.println("El número "+numero+" es par.\n\n");
        }
        else {
            System.out.println("El número "+numero+" es impar.\n\n");
        }
    //Ejercicio 8
        System.out.println("Ingrese un caracter: ");
        sc = new Scanner(System.in);
        char carac = sc.next().charAt(0);
        if (carac >= 'A' && carac <= 'Z'){
            System.out.println("El caracter es una letra mayúscula.\n\n");
        }
        else {
            System.out.println("El caracter no es una letra mayúscula.\n\n");
        }

    //Ejercicio 9 y 10
        System.out.println("Ingrese la medida del lado a:");
        sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Ingrese la medida del lado b:");
        sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println("Ingrese la medida del lado c:");
        sc = new Scanner(System.in);
        int c = sc.nextInt();
        if (a <= 0){
            System.out.println("No ingreso un valor valido para el lado a.");
        }
        else if (b <= 0){
            System.out.println("No ingreso un valor valido para el lado b.");
        } else if (c <= 0) {
            System.out.println("No ingreso un valor valido para el lado c.");
        }
        else if (((a + b) >= c) && ((a + c) >= b) && ((b + c) >= a)){
            if ((a == b) && (a == c)){
                System.out.println("El triángulo es equilatero.");
            }
            else if ((a == b) || (b == c) || (a == c)) {
                System.out.println("El triángulo es isóceles.");
            }
            else {
                System.out.println("El triángulo es escaleno.");
            }
        }
        else {
            System.out.println("No se puede formar un triángulo.");
        }
    }
}