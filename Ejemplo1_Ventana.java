import javax.swing.JFrame;
public class Ejemplo1_Ventana {
    public static void main(String[] args) {
// Crear la ventana principal
        JFrame ventana = new JFrame("Mi Primera Ventana");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
// Mostrar la ventana
        ventana.setVisible(true);
    }
}
//1. ¿Qué sucede si cambia EXIT ON CLOSE por DO NOTHING ON CLOSE y presiona el botón de
//cerrar de la ventana?
//R:La X para poder cerrar esa ventana no funcionaría, no se ejecuta que debe cerrar la ventana

//2. ¿Qué ocurre visualmente si elimina la línea ventana.setVisible(true);?
//Si se quita esa línea entonces ya no es posible ver la nueva ventana.

