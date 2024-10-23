EJERCICIO 22 PROYECTO DEL POLITECNICO

Enunciado:

![enunciado_proyecto_politecnico](https://github.com/user-attachments/assets/92e3f3bb-9a8d-45cf-bed5-2668ed97e262)

Codigo del proyecto en java:

    package politecnico_mayor;
    import javax.swing.JOptionPane;

    public class taller_mejorado {
        public static void main(String[] args) {
            String[] nombreestudiantes = new String[3];
            String[] apellidoestudiantes = new String[3];
            double[][] programacion_1 = new double[3][3];
            double[][] programacion_2 = new double[3][3];
            double[][] estructura_datos = new double[3][3];
            double[] nota_final_p1 = new double[3];
            double[] nota_final_p2 = new double[3];
            double[] nota_final_ed = new double[3];
            double[] promedio_final = new double[3];

            for (int i = 0; i < 3; i++) {
                nombreestudiantes[i] = JOptionPane.showInputDialog("Ingresa el nombre del estudiante " + (i + 1) + ": ");
                apellidoestudiantes[i] = JOptionPane.showInputDialog("Ingresa el apellido del estudiante " + (i + 1) + ": ");
                JOptionPane.showMessageDialog(null, nombreestudiantes[i] + " " + apellidoestudiantes[i] + ", ingresa las notas para Programación 1.");
                for (int j = 0; j < 3; j++) {
                    programacion_1[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la nota del corte " + (j + 1) + " (Programación 1): "));
                }
                nota_final_p1[i] = programacion_1[i][0] * 0.30 + programacion_1[i][1] * 0.30 + programacion_1[i][2] * 0.40;
                JOptionPane.showMessageDialog(null, "Ingresa las notas para Programación 2.");
                for (int j = 0; j < 3; j++) {
                    programacion_2[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la nota del corte " + (j + 1) + " (Programación 2): "));
                }
                nota_final_p2[i] = programacion_2[i][0] * 0.30 + programacion_2[i][1] * 0.30 + programacion_2[i][2] * 0.40;
                JOptionPane.showMessageDialog(null, "Ingresa las notas para Estructura de Datos.");
                for (int j = 0; j < 3; j++) {
                    estructura_datos[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la nota del corte " + (j + 1) + " (Estructura de Datos): "));
                }
                nota_final_ed[i] = estructura_datos[i][0] * 0.30 + estructura_datos[i][1] * 0.30 + estructura_datos[i][2] * 0.40;
                promedio_final[i] = (nota_final_p1[i] + nota_final_p2[i] + nota_final_ed[i]) / 3;
            }
            for (int i = 0; i < 3; i++) {
                String resultado = "Estudiante " + (i + 1) + ": " + nombreestudiantes[i] + " " + apellidoestudiantes[i] + "\n";
                resultado += "Programación 1: \n" +
                             "Corte 1: " + programacion_1[i][0] + " Porcentaje aplicado: " + (programacion_1[i][0] * 0.30) + "\n" +
                             "Corte 2: " + programacion_1[i][1] + " Porcentaje aplicado: " + (programacion_1[i][1] * 0.30) + "\n" +
                             "Corte 3: " + programacion_1[i][2] + " Porcentaje aplicado: " + (programacion_1[i][2] * 0.40) + "\n" +
                             "Nota Final: " + nota_final_p1[i] + "\n";
                resultado += "Programación 2: \n" +
                             "Corte 1: " + programacion_2[i][0] + " Porcentaje aplicado: " + (programacion_2[i][0] * 0.30) + "\n" +
                             "Corte 2: " + programacion_2[i][1] + " Porcentaje aplicado: " + (programacion_2[i][1] * 0.30) + "\n" +
                             "Corte 3: " + programacion_2[i][2] + " Porcentaje aplicado: " + (programacion_2[i][2] * 0.40) + "\n" +
                             "Nota Final: " + nota_final_p2[i] + "\n";
                resultado += "Estructura de Datos: \n" +
                            "Corte 1: " + estructura_datos[i][0] + " Porcentaje aplicado: " + (estructura_datos[i][0] * 0.30) + "\n" +
                            "Corte 2: " + estructura_datos[i][1] + " Porcentaje aplicado: " + (estructura_datos[i][1] * 0.30) + "\n" +
                             "Corte 3: " + estructura_datos[i][2] + " Porcentaje aplicado: " + (estructura_datos[i][2] * 0.40) + "\n" +
                             "Nota Final: " + nota_final_ed[i] + "\n";
                resultado += "Promedio Final: " + promedio_final[i] + "\n";
                if (promedio_final[i] > 4.0) {
                    resultado += "Descuento: 10% en la matrícula.\n";
                    } else {
                    resultado += "No obtiene descuento.\n";
                }
                JOptionPane.showMessageDialog(null, resultado);
            }
        }
    }


Resultado del proyecto:

![resultado_1_proyecto](https://github.com/user-attachments/assets/e4323794-b008-4f0c-8985-ac42c8cf715b)
![resultado_2_proyecto](https://github.com/user-attachments/assets/dca3b869-b05b-4ace-8321-b9af5ff33d3a)
![resultado_3_proyecto](https://github.com/user-attachments/assets/776c818b-f253-4c46-90a6-06f7930d21af)







