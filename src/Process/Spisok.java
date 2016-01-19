package Process;


import javax.swing.*;
import java.awt.*;

public class Spisok extends JFrame {

    // Счетчики
    public static int karma;
    public static int day;
    public static int proekt;
    public static int step;
    public static int shtraf;

    // Вывод текста на экран
    public static String message;
    public static String resultat;

    //  Элементы фрейма
    JPanel panelMain = new JPanel();
    JPanel panel = new JPanel(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();

    JTextArea textArea = new JTextArea();

    JButton button = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");

    JTextField karmaField = new JTextField(3);
    JTextField spalilsyaField = new JTextField(3);
    JTextField proektField = new JTextField(3);

    JLabel image = new JLabel();
}
