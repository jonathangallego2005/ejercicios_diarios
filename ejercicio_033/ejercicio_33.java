package programacion_practica.ejercicio_33;
import java.util.Scanner;
public class ejercicio_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena: ");
        String s = scanner.nextLine();
        String resultado = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                resultado += (char)(c + 32);
            }
            else if (c >= 'a' && c <= 'z') {
                resultado += (char)(c - 32);
            }
            else {
                resultado += c;
            }
        }
        System.out.println(resultado);
        scanner.close();
    }   
}
