package programacion_practica.ejercicio_24;
import javax.swing.JOptionPane;
public class ejercicio_24 {
    public static void main(String[] args) {
        String cadena1, cadena2;
        int longitudcadena1, longitudcadena2;
        cadena1 = JOptionPane.showInputDialog("Ingresa la primera cadena:");
        cadena2 = JOptionPane.showInputDialog("Ingresa la segunda cadena:");
        longitudcadena1 = cadena1.length();
        longitudcadena2 = cadena2.length();
        if (longitudcadena1 >= longitudcadena2) {
            String finalCadena1 = cadena1.substring(longitudcadena1 - longitudcadena2);
            if (finalCadena1.equals(cadena2)) {
                JOptionPane.showMessageDialog(null, "Verdadero");
            } else {
                JOptionPane.showMessageDialog(null, "Falso");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Falso");
        }
    }  
}
