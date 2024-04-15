import java.util.Scanner;

public class SentenciaDoWhileYFor2 {
    public static void main(String[] args) {
        //Ejercicio 15
        //Version a
        System.out.println("Version a");
        System.out.println("Ingrese un numero o ingrese 0 para finalizar: ");
        Scanner sc1 = new Scanner(System.in);
        int num = sc1.nextInt();
        while (num != 0) {
            if (num > 0) {
                System.out.println("El número es positivo.");
            } else {
                System.out.println("El número es negativo.");
            }
            System.out.println("Ingrese un numero o ingrese 0 para finalizar: ");
            sc1 = new Scanner(System.in);
            num = sc1.nextInt();
        }
        System.out.println("Fin del programa version a.");

        //version b
        System.out.println("Version b");
        System.out.println("Ingrese un numero o ingrese 0 para finalizar: ");
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();
        do {
            if (num2 > 0) {
                System.out.println("El número es positivo.");
            } else {
                System.out.println("El número es negativo.");
            }
            System.out.println("Ingrese un numero o ingrese 0 para finalizar: ");
            sc2 = new Scanner(System.in);
            num2 = sc2.nextInt();
        } while (num2 != 0);
        System.out.println("Fin del programa version b.");

        //Version c
        System.out.println("Version c");
        int num3 = 0;
        char respuesta = 's';
        do {
            System.out.println("Ingrese un numero:");
            Scanner sc3 = new Scanner(System.in);
            num3 = sc3.nextInt();
            if (num3 > 0) {
                System.out.println("El número es positivo.");
            } else {
                System.out.println("El número es negativo.");
            }
            System.out.println("¿Desea ingresar un nuevo numero? (S/N):");
            sc3 = new Scanner(System.in);
            respuesta = sc3.nextLine().charAt(0);
        } while (respuesta != 'N' && respuesta != 'n');
        System.out.println("Fin del programa version c.");
    }
}
