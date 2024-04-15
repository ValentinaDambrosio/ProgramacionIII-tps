import java.util.Scanner;
public class SentenciaSwitch {
    public static void main(String[] args) {
        int day = 0;
        System.out.println("Ingrese el número del día de la semana: ");
        Scanner scanner = new Scanner(System.in);
        try {
            day = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("No ingresó un argumento válido.");
            return;
        }
        String dayNombre;

        switch (day) {
            case 1:
                dayNombre = "Lunes";
                break;
            case 2:
                dayNombre = "Martes";
                break;
            case 3:
                dayNombre = "Miércoles";
                break;
            case 4:
                dayNombre = "Jueves";
                break;
            case 5:
                dayNombre = "Viernes";
                break;
            case 6:
                dayNombre = "Sábado";
                break;
            case 7:
                dayNombre = "Domingo";
                break;
            default:
                dayNombre = "No ingresó un número de la semana válido.";
                break;
        }

        System.out.println(dayNombre);
    }
}

