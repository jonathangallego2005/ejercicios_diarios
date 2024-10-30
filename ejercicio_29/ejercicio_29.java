package programacion_practica.ejercicio_29;
import java.util.Scanner;
public class ejercicio_29 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n,cuadrado=0;
        System.out.println("Ingresa un número: ");
        n = entrada.nextInt();
        for(int i = n; i >= 0; i--){
            cuadrado = i * i; 
            System.out.println(cuadrado);
        }
        entrada.close();
    }
}
