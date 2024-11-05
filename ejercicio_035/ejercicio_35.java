package programacion_practica.ejercicio_35;
import java.util.Scanner;
public class ejercicio_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena: ");
        String line = scanner.nextLine();
        String[] words = line.split(" ");
        String result = String.join("-", words);
        System.out.println(result);
        scanner.close();
    }
}
