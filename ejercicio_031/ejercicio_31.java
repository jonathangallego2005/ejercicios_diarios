package programacion_practica.ejercicio_31;
import java.util.Scanner;
public class ejercicio_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de x: ");
        int x = scanner.nextInt();
        System.out.print("Ingrese el valor de y: ");
        int y = scanner.nextInt();
        System.out.print("Ingrese el valor de z: ");
        int z = scanner.nextInt();
        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                for (int k = 0; k <= z; k++) {
                    if (i + j + k != n) {
                        System.out.println("[" + i + ", " + j + ", " + k + "]");
                    }
                }
            }
        }
        scanner.close();
    }
}

