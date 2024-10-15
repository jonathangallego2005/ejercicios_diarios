import java.util.Scanner;
public class ejercicio_16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int mayor,menor,suma;
        int[] numeros = new int[5];
        for(int i = 0; i<5; i++){
            System.out.print("Ingresa el número "+(i+1)+" : ");
            numeros[i] = entrada.nextInt();
        }
        System.out.print( "Los números que ingresaste son: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i] + " "); 
        }    
        mayor = numeros[0];
        menor = numeros[0];
        for (int i = 1; i < 5; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println(" ");
        suma = mayor + menor;
        System.out.print("Y la suma de el número mayor y el número menor es: "+suma);
        
        entrada.close();
    }
}
