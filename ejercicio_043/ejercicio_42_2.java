package programacion_practica.ejercicio_42;
import java.util.Scanner;
public class ejercicio_42_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] datos = new int[3];
        int a, b, c, d;
        for(int i = 0; i<3; i++){
            System.out.print("Ingresa el número "+(i+1)+" : ");
            datos[i] = entrada.nextInt();
        }
        a = datos[0] * (datos[1] + datos[2]);
        b = datos[0] * datos[1] *  datos[2];
        c = datos[0] + datos[1] * datos[2];
        d = (datos[0] + datos[1]) * datos[2];
        System.out.println("Los resultados son: \n"
        + a+"\n"
        + b+"\n"
        + c+"\n"
        + d);
        if ((a > b) && (a>c) && (a>d)) {
            System.out.print("El valor máximo que se puede obtener es: "+ a);
        }
        else if ((b>a) && (b>c) && (b>d)) {
            System.out.print("El valor máximo que se puede obtener es: "+ b);
        }
        else if ((c>a) && (c>b) && (c>d)) {
            System.out.print("El valor máximo que se puede obtener es: "+ c);
        }
        else if ((d>a) && (d>b) && (d>c)) {
            System.out.print("El valor máximo que se puede obtener es: "+ d);
        }
        entrada.close();   
    }
}
