package programacion_practica.ejercicio_21;
import java.util.Scanner;
public class ejercicio_21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String s ;
        System.out.println("Ingresa la cadena de texto: ");
        s = entrada.next();
        int errores = 0;
        int totalCaracteres = 0;
        for (int i = 0; i < 1; i++) {
            String cadena = s;
            int longitud = cadena.length();
            totalCaracteres += longitud;
            for (int j = 0; j < longitud; j++) {
                char letra = cadena.charAt(j);
                if (letra < 'a' || letra > 'm') {
                    errores++;
                }
            }
        }
        System.out.println(errores + "/" + totalCaracteres);
        entrada.close();
    }
}   

