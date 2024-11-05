package programacion_practica.ejercicio_36;
import java.util.Scanner;
public class ejercicio_36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el tamaño de la matriz (impar): ");
        int n = scanner.nextInt();
        int[] numeros = new int[n];
        System.out.println("Ingresa los números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }
        int unico = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (numeros[i] == numeros[j]) {
                    count++;
                }
            }
            if (count == 1) {
                unico = numeros[i];
                break;
            }
        }
        System.out.println("El número único es: " + unico);
        scanner.close();
    }
}
