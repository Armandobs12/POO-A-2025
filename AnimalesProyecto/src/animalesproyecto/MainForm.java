import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Random;

public class MainForm extends JFrame {
    private JTable tabla;
    private DefaultTableModel modelo;

    public MainForm() {
        setTitle("Sonidos de Animales");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        modelo = new DefaultTableModel();
        modelo.addColumn("Índice");
        modelo.addColumn("Sonido");

        tabla = new JTable(modelo);
        add(new JScrollPane(tabla), BorderLayout.CENTER);

        llenarTabla();

        setVisible(true);
    }

    private void llenarTabla() {
        Animal[] animales = new Animal[10];
        Random random = new Random();

        for (int i = 0; i < animales.length; i++) {
            if (random.nextBoolean()) {
                animales[i] = new Perro();
            } else {
                animales[i] = new Gato();
            }
            modelo.addRow(new Object[]{i, animales[i].hacerSonido()});
        }
    }

    public static void main(String[] args) {
        new MainForm();
    }
}