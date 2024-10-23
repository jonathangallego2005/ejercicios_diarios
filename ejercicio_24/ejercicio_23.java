package programacion_practica.ejercicio_23;
import java.util.Scanner;
public class ejercicio_23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] list = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.print("Ingresa el elemento "+(i+1)+" de la la lista: ");
            list[i] = entrada.nextInt();
        }
        int currentIndex = 0;  
        String input;
        do {
            System.out.print("Escribe 'next' para siguiente, 'prev' para anterior, o 'salir' para terminar: ");
            input = entrada.nextLine();
            if (input.equals("next")) {
                System.out.println("Elemento actual: " + list[currentIndex]);
                currentIndex = (currentIndex + 1) % list.length;  
            } else if (input.equals("prev")) {
                currentIndex = (currentIndex - 1 + list.length) % list.length; 
                System.out.println("Elemento actual: " + list[currentIndex]);
            }
        } while (!input.equals("salir"));
        entrada.close();
    }
    
}
