package programacion_practica.ejercicio_44;
import java.util.Scanner;
public class ejercicio_44_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de números que tendrá tu matriz: ");
        int cantidad = entrada.nextInt();
        int[] numeros = new int[cantidad];
        System.out.println("Ingresa la mayoria de los número iguales (sino te saldra un error)");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el número " + (i + 1) + " : ");
            numeros[i] = entrada.nextInt();
        }
        int diferente = 0;
        if (numeros[0] == numeros[1]) {
            for (int i = 2; i < cantidad; i++) {
                if (numeros[i] != numeros[0]) {
                    diferente = numeros[i];
                    break;
                }
            }
        } else {
            diferente = (numeros[0] == numeros[2]) ? numeros[1] : numeros[0];
        }
        System.out.println("El número diferente es: " + diferente);
        entrada.close();
    }
}


