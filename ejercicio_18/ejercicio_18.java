import java.util.Scanner;
public class ejercicio_18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] matriz = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.print("Ingresa el número: "+(i+1)+" : ");
            matriz[i] = entrada.nextInt();
        }
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = matriz[i] * 2;
        }
        for (int valor : matriz) {
            System.out.print(valor + " ");
        }
        entrada.close();
    }
}        