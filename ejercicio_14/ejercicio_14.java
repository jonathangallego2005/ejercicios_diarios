import java.util.Scanner;
public class ejercicio_14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int multiplicacion =0;
        int[] numeros = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.print("Ingresa el numero "+(i+1)+" : ");
            numeros[i] = entrada.nextInt();
        }
        for(int j = 0; j<5; j++){
            System.out.print(numeros[j]);
        }
        multiplicacion = numeros[0] * numeros[1] * numeros[2] * numeros[3] * numeros[4];
        System.out.println(" = "+numeros[0]+" * "+numeros[1]+" * "+numeros[2]+" * "+numeros[3]+" * "+numeros[4]+" = "+multiplicacion);
        entrada.close();
        
    }
}