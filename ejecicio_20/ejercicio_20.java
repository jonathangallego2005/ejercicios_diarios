import java.util.Scanner;
public class ejercicio_20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int m=0;
        double n;
        System.out.println("Ingresa 2 números");
        System.out.print("Ingresa el números 1, (la cantidad de veces que se va a multiplicar el número 2): ");
        m = entrada.nextInt();
        System.out.print("Ingresa el número 2, (el número que se va a multiplicar): ");
        n = entrada.nextDouble();
        double[] multiplo = new double[m];
        for (int i = 0; i < m; i++) {
            multiplo[i] = n * (i + 1);
        } 
        for(int i = 0; i < m; i++){
            System.out.println(multiplo[i]);
        }
        entrada.close();
    }  
}
