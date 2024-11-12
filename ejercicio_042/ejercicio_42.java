package programacion_practica.ejercicio_42;
import java.util.Scanner;
public class ejercicio_42 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el número de veces que alex gira el aro: ");
        int veces = entrada.nextInt();
        if (veces>=10) {
            System.out.println("Great, now move on to tricks");
        }else{
            System.out.println("Keep at it until you get it");
        }
        entrada.close();
    }
}
