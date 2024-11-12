package programacion_practica.ejercicio_40;
import java.util.Scanner;
public class ejercicio_40 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el número de la fila que quieres sumar: ");
        int numero = entrada.nextInt();
        int iniciar = numero * numero - (numero - 1);
        int resultado = 0;
        String suma = ""; 
        for (int i = iniciar; i < iniciar + numero * 2; i += 2) {
            resultado += i;
            suma += i; 
            if (i < iniciar + (numero - 1) * 2) {
                suma += " + ";  
            }
        } 
        System.out.println(suma+ " = "+resultado);
        entrada.close();
    }
}


