package programacion_practica.ejercicio_25;
import java.util.Scanner;
public class ejercicio_25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena;
        System.out.print("Ingresa la cadena: ");
        cadena = entrada.next();
        String complemento = ""; 
        for (int i = 0; i < cadena.length(); i++) {
            char simbolo = cadena.charAt(i);
            if (simbolo == 'A') {
                complemento += 'T';
            } else if (simbolo == 'T') {
                complemento += 'A';
            } else if (simbolo == 'C') {
                complemento += 'G';
            } else if (simbolo == 'G') {
                complemento += 'C';
            }
        }
        System.out.println("Cadena complementaria: "+complemento);
        entrada.close();
    }   
}
