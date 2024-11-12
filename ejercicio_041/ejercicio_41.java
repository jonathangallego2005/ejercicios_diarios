package programacion_practica.ejercicio_41;
import java.util.Scanner;
public class ejercicio_41 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el numero de inicio: ");
        int inicio = entrada.nextInt();
        System.out.print("Ingresa el número de finalización: ");
        int finalización = entrada.nextInt();
        for (int i = inicio; i <= finalización; i++) {
            String numerotexto = String.valueOf(i);
            if (numerotexto.contains("5")) {
                continue;
            }
            System.out.println(i);
        }
        entrada.close();
    }
}
/*¡No me des cinco!
En este kata se obtiene el número de inicio y el número final de una región y se debe devolver el recuento de todos los números excepto los que contienen un 5. ¡El número de inicio y el número final son ambos inclusivos!

Ejemplos:

1,9 -> 1,2,3,4,6,7,8,9 -> Result 8
4,17 -> 4,6,7,8,9,10,11,12,13,14,16,17 -> Result 12
El resultado puede contener cincos. ;-)
El número inicial siempre será menor que el número final. ¡Ambos números también pueden ser negativos!*/
