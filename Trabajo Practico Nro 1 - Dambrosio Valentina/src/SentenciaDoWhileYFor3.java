import java.util.Scanner;

public class SentenciaDoWhileYFor3 {
    public static void main(String[] args) {
        //Ejercicio 16
        Scanner sc4 = new Scanner(System.in);
        double kilometros;
        double millas = 1;
        do {
            System.out.print("Ingrese la cantidad de millas a convertir o ingrese 0 para salir): ");
            millas = sc4.nextDouble();
            if (millas != 0) {
                kilometros = millas * 1.6093;
                System.out.printf("El equivalente a %.2f millas son %.2f kilómetros.\n", millas, kilometros);
            }
        } while (millas != 0);

        System.out.println("Fin del programa.");
    }
}
