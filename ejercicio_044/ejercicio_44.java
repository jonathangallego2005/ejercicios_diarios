package programacion_practica.ejercicio_44;
import java.util.Scanner;
public class ejercicio_44 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int a = entrada.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int b = entrada.nextInt();
        System.out.println(a+" "+b);
        if (a == b) {
            System.out.println(a+" since both are same");
        }else{
            int suma = a+b;
            System.out.println(suma);
        }
        entrada.close();
    }
}
