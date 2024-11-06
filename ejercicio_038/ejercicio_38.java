import java.util.Scanner;
public class ejercicio_38 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cuantos números triangulares vas a ingresar: ");
        int cantidad = entrada.nextInt();
        int[] numeros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el número triangular " + (i + 1) + " : ");
            numeros[i] = entrada.nextInt();
        }
        for (int i = 0; i < cantidad; i++) {
            int resultado = 0;
            if (numeros[i] > 0) {
                resultado = numeros[i] * (numeros[i] + 1) / 2;
            }
            System.out.println("El " + numeros[i] + " número triangular es: " + resultado);
        }
        entrada.close();
    }
}
