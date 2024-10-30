package programacion_practica.ejercicio_28;
import java.util.Scanner;
public class ejercicio_28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c, d, e;
        System.out.print("Ingresa el número 1:");
        a = entrada.nextInt();
        System.out.print("Ingresa el número 2:");
        b = entrada.nextInt();
        c = a+b;
        d = a-b;
        e = a*b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        entrada.close();
    }
}
