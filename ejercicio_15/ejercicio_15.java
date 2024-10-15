import javax.swing.JOptionPane;
public class ejercicio_15 {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número:"));
        JOptionPane.showMessageDialog(null, " ¿El número es par: VERDADERO o FALSO?");
        
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "VERDADERO "+"El número "+numero+" es par");
        }else{
            JOptionPane.showMessageDialog(null, "FALSO "+"El número "+numero+" es impar");
        }  
    }
}


