package programacion_practica.ejercicio_22;
import java.util.Scanner;
public class ejercicio_22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cuantas cadenas vas a ingresar: ");
        int cantidad = entrada.nextInt();
        String[] cadenas = new String[cantidad];
        for(int i = 0; i < cantidad; i++){
            System.out.print("Ingresa la cadena de texto "+(i+1)+" : ");
            cadenas[i] = entrada.next();
        }
        int[] resultados = new int[cadenas.length];
        for (int i = 0; i < cadenas.length; i++) {
            int valorCadena = 0;
            String cadena = cadenas[i];
            for (int j = 0; j < cadena.length(); j++) {
                char c = cadena.charAt(j);
                if (c != ' ') {
                    valorCadena += c - 'a' + 1;
                }
            }
            resultados[i] = valorCadena * (i + 1); 
        }
        for (int i = 0; i<cantidad; i++) {
            System.out.println(cadenas[i]+" = "+resultados[i]);
        }
        entrada.close();
    }

}
