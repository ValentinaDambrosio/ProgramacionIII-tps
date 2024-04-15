import java.util.Scanner;
public class SentenciaDoWhileYFor1 {
    public static void main(String[] args) {
        System.out.println("Ingrese un número para A: ");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println("Ingrese un número para B: ");
        sc = new Scanner(System.in);
        int B = sc.nextInt();
        if (B <= A) {
            do {
                System.out.println("El numero B tiene que se mayor a A.");
                System.out.println("Ingrese un número para A: ");
                sc = new Scanner(System.in);
                A = sc.nextInt();
                System.out.println("Ingrese un número para B: ");
                sc = new Scanner(System.in);
                B = sc.nextInt();
            } while (B <= A);
        }
        System.out.println("Numeros pares entre " + A + " y " + B + ":");
        for (int i = A + 1; i < B; i++) {
            if ((i % 2) == 0) {
                System.out.print(i + " ");
            }
        }
    }
}