import java.util.Scanner;
public class ejercicio_19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String resultado = "",letra;
        char caracter;
        System.out.print("Ingresa varias letras o una cadena de letras: ");
        letra = entrada.nextLine();
        for (int i = 0; i < letra.length(); i++) {
            caracter = letra.charAt(i);
            resultado += Character.toUpperCase(caracter);
            for (int j = 0; j < i; j++) {
                resultado += Character.toLowerCase(caracter);
            }
            if (i < letra.length() - 1) {
                resultado += "-";
            }
        }
        System.out.println(resultado);
        entrada.close();
    }   
}
