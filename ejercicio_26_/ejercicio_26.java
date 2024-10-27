package programacion_practica.ejercicio_26;
import java.util.Scanner;
public class ejercicio_26 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a,b,c;
        System.out.print("Ingresa el número 1: ");
        a = entrada.nextInt();
        System.out.print("Ingresa el número 2: ");
        b = entrada.nextInt();
        c = a/b;
        System.out.println(c);
        float A,B,C;
        A = a;
        B = b;
        C = A/B;
        System.out.println(C);
        entrada.close();
    }  
}
