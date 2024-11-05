package programacion_practica.ejercicio_32;
import java.util.Arrays;
import java.util.Scanner;
public class ejercicio_32 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cuántos números tiene la cadena (mínimo 4): ");
        int cantidad = entrada.nextInt();
        if (cantidad < 4) {
            System.out.println("Debe ingresar al menos 4 números.");
            entrada.close();
            return;
        }
        long[] numeros = new long[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = entrada.nextLong();
        }
        Arrays.sort(numeros);
        long resultado = numeros[0] + numeros[1];
        System.out.println("La suma de los dos números más bajos es: " + resultado);
        entrada.close();
    }
}
