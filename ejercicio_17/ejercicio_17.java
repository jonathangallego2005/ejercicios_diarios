import java.util.Scanner;
public class ejercicio_17 {
    public static void main(String[] args) {
        int[] numero = new int[10];
        boolean creciente=false, decreciente=false;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa numeros de 1 al 10:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa el número "+ (i+1)+ " : ");
            numero[i] = entrada.nextInt();
        }
        for(int i = 0; i < 9; i++ ){
            if (numero[i]<numero[i+1]) {
                creciente = true;
            }
            if (numero[i]>numero[i+1]) {
                decreciente = true;
            }
        }
        if (creciente==true && decreciente==false){
            System.out.print("Los números que ingresaste estan en orden creciente ");
        }else if (decreciente==false && creciente==true) {
            System.out.print("Los números que ingresaste estan en orden decreciente ");
        }else if (decreciente==true && creciente==true) {
            System.out.print("Los números que ingresaste estan en desorden ");
        }else if (decreciente==false && creciente==false) {
            System.out.print("Los números que ingresaste todos son iguales ");
        }
        entrada.close(); 
    }
    
}
