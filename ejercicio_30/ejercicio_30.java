package programacion_practica.ejercicio_30;
import java.util.Scanner;
public class ejercicio_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un año: ");
        int year = scanner.nextInt();
        scanner.close();
        boolean esbisiesto = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    esbisiesto = true;
                }
            } else {
                esbisiesto = true;
            }
        }
        System.out.println(esbisiesto);
    }
}
