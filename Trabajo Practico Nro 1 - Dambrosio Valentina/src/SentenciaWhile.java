import java.util.Scanner;

public class SentenciaWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cadena = "";

        System.out.println("Ingrese palabras (presione Enter al terminar de escribir, dejar vacío para terminar el programa):");

        String palabras;
        do {
            palabras = scanner.nextLine();
            if (!palabras.isEmpty()) {
                cadena += palabras + " ";
            }
        } while (!palabras.isEmpty());

        System.out.println("La concatenación de las palabras ingresadas es:");
        System.out.println(cadena.trim());
        scanner.close();
    }
}
