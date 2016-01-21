package Process;


import javax.swing.*;
import java.awt.*;
import java.math.*;

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

     JButton button = new JButton();
    final JButton button2 = new JButton();
    final JButton button3 = new JButton();
    final JButton button4 = new JButton();
    final JButton button5 = new JButton();

    JTextField karmaField = new JTextField(3);
    JTextField spalilsyaField = new JTextField(3);
    JTextField proektField = new JTextField(3);

    JLabel image = new JLabel();
}
