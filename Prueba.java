import javax.swing.*;
import java.awt.*;

public class Ejemplo6_Menu {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Menús");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar barraMenu = new JMenuBar();
        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem itemNuevo = new JMenuItem("Nuevo");
        JMenuItem itemSalir = new JMenuItem("Salir");
        JMenuItem itemCambiarFondo= new JMenuItem( "Cambiar color de fondo");
        itemCambiarFondo.addActionListener(e -> {
            ventana.getContentPane().setBackground(Color.CYAN);
        });
        itemSalir.addActionListener(e -> System.exit(0));
        menuArchivo.add(itemNuevo);
        menuArchivo.add(itemCambiarFondo);
        menuArchivo.addSeparator();
        menuArchivo.add(itemSalir);
        JMenu menuAyuda = new JMenu("Ayuda");
        JMenuItem itemAcerca = new JMenuItem("Acerca de");
        itemAcerca.addActionListener(e ->
                JOptionPane.showMessageDialog(ventana, "Taller de GUI en Java - Swing"));
        menuAyuda.add(itemAcerca);
        barraMenu.add(menuArchivo);
        barraMenu.add(menuAyuda);
        ventana.setJMenuBar(barraMenu);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}

