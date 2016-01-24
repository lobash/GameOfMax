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
    public static double procent = 4.0;


    // Вывод текста на экран
    public static String message;
    public static String resultat;
    final static String popitkaJava = "Вы попытались тайком хоть что-то сделать в Вашем подпольном проекте ";
    final static String popitkaPlagiat = "'Ну и зачем тебе это?' - спросили вы себя. \n" +
            "'Ты ведь обещал всё писать сам!' - и стало совестно очень.";

    //  Метод, возвращающий игру, в исходное состояние по кнопкам.

    public void removeButton() {
        button.setVisible(true);
        button2.setVisible(false);
        button3.setVisible(false);
        button4.setVisible(false);
        button1.setVisible(false);
    }

    //    Условие для нового дня
    public void newDay() {

        switch (step) {
            case 5:
                step = 0;
                day += 1;
                procent = 4.0;
                shtraf = 0;
                shtrafField.setText(String.valueOf(shtraf));
                break;
        }
    }

//    Условие для гейм овера по штрафам

    public void shtrafGameOver() {
        if (shtraf >= 3) {
            resultat = " Начальник пронюхал твои делишки, и уволил тебя. Game Over. ";
            removeButton();
            textArea.setText(resultat);
            image.setIcon(new ImageIcon(getClass().getResource("/Image/uvolen.jpg")));
        }
    }

//    Условие для гейм овера по карме

    public void karmaGameOver() {
        if (karma >= 3) {
            image.setIcon(new ImageIcon(getClass().getResource("/Image/mt.jpg")));
            resultat = "Вы почувствовали знак свыше, что необходимо сходить покурить, даже если Вы не курите. \n" +
                    "Стрельнув сигарету, отходите, и в Вас прилетает метеорит в форме макарон. Game Over.";
            textArea.setText(resultat);
            removeButton();
        }
    }

//        Условие для гейм овера по окончанию дней

    public void totalGame() {
        if (proekt >= 100 && day >= 5) {
            resultat = "Вы выйграли! Молодец! У Вас хорошее будущее! ";
            removeButton();
            textArea.setText(message + resultat);
            image.setIcon(new ImageIcon(getClass().getResource("/Image/win.jpg")));

        } else if (proekt < 100 && day >= 5) {
            resultat = "Простите, но проект не закончен. Начальник узнал что вы пишете на Java и выгнал Вас, а без портфолио Вы не устроитесь на работу \n" +
                    "Да и жена Вас скорее всего бросит. Конец. Game Over.";
            removeButton();
            textArea.setText(message + resultat);
            image.setIcon(new ImageIcon(getClass().getResource("/Image/lose.jpg")));
        }
        message = "Ну чтож, всё хорошое в этом мире когда-либо заканчивается, и наша игра не исключение.\n" +
                resultat;
    }

//    Вернуть для новой игры все счетчики в исходное состояние

    public void stockElement() {
        shtraf = 0;
        shtrafField.setText(String.valueOf(shtraf));
        karma = 0;
        karmaField.setText(String.valueOf(karma));
        proekt = 0;
        proektField.setText(String.valueOf(proekt));
        procent = 5.0;
        step = 0;
        day = 0;
        image.setIcon(new ImageIcon(getClass().getResource("/Image/kot_pilot.jpg")));
    }

//    Метод разукрашивания полей

    public void editColor() {
        if (shtraf == 0) {
            shtrafField.setBackground(Color.green);
        } else if (shtraf == 1) {
            shtrafField.setBackground(Color.yellow);
        } else if (shtraf == 2) {
            shtrafField.setBackground(Color.RED);
        }

        if (karma == 0) {
            karmaField.setBackground(Color.green);
        } else if (karma == 1) {
            karmaField.setBackground(Color.yellow);
        } else if (karma == 2) {
            karmaField.setBackground(Color.red);
        }

        if (proekt == 0) {
            proektField.setBackground(Color.white);
        } else if (proekt >= 50) {
            proektField.setBackground(Color.yellow);
        } else if (proekt >= 100) {
            proektField.setBackground(Color.green);
        }
    }

    //  Элементы фрейма

    JPanel panelMain = new JPanel();
    JPanel panel = new JPanel(new GridBagLayout());

    GridBagConstraints c = new GridBagConstraints();

    JTextArea textArea = new JTextArea();

    JButton button = new JButton();
    final JButton button2 = new JButton();
    final JButton button3 = new JButton();
    final JButton button4 = new JButton();
    final JButton button1 = new JButton();

    JTextField karmaField = new JTextField(3);
    JTextField shtrafField = new JTextField(3);
    JTextField proektField = new JTextField(3);

    JLabel image = new JLabel();
}
