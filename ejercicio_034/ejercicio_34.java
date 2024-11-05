package programacion_practica.ejercicio_34;
import java.util.Scanner;
public class ejercicio_34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número (a): ");
        int a = scanner.nextInt();
        System.out.print("Ingresa el segundo número (b): ");
        int b = scanner.nextInt();
        int suma = 0;
        int inicio = Math.min(a, b);
        int fin = Math.max(a, b);
        for (int i = inicio; i <= fin; i++) {
            suma += i;
        }
        System.out.println("La suma entre " + a + " y " + b + " es: " + suma);
        scanner.close();
    }
}
