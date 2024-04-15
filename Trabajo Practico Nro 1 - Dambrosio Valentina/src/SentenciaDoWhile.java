import java.util.Scanner;
public class SentenciaDoWhile {
    public static void main(String[] args) {
        //Ejercicio 11
        int contador = 1;
        do {
            System.out.println(contador);
            contador += 1;
        } while (contador <= 100);

        //Ejercicio 12
        System.out.println("Ingrese un número:");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int resultado = 1;
        if (numero < 0){
            numero *= -1;
        }
        for (int i=1; i<=numero; i++){
            resultado *= i;
        }
        System.out.println("El factorial del numero "+numero+" es: "+ resultado);

        //Ejercicio 13
        System.out.println("Numeros del 500 al 200:");
        for (int t=500; t >=200; t--){
            System.out.println(t);
        }
    }
}
