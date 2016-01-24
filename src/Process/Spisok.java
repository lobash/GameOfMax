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
    public static double procent = 4.0;


    // Вывод текста на экран
    public static String message;
    public static String resultat;
    final static String popitkaJava = "Вы попытались тайком хоть что-то сделать в Вашем подпольном проекте ";
    final static String popitkaPlagiat = "'Ну и зачем тебе это?' - спросили вы себя. \n" +
            "'Ты ведь обещал всё писать сам!' - и стало совестно очень.";
    public void removeButton(){
        button.setVisible(true);
        button2.setVisible(false);
        button3.setVisible(false);
        button4.setVisible(false);
        button5.setVisible(false);
    }

//    Условие для нового дня
    public void newDay() {

        switch (step) {
            case 5:
                step = 0;
                day += 1;
                break;
        }
    }
    public void shtrafGameOver (){
        if(shtraf>=5){
            resultat=" Начальник пронюхал твои делишки, и уволил тебя. Game Over ";
            removeButton();
            textArea.setText(resultat);
        }
    }

    //          Условие для гейм овера по карме
    public void karmaGameOver() {
        if (karma >= 5) {
            resultat = "Вы почувствовали знак свыше, что необходимо сходить покурить, даже если Вы не курите. /n" +
                    "Стрельнув сигарету, отходите, и в Вас прилетает метиорит в форме макарон. Game Over";
            removeButton();
        }
    }

//        Условие для гейм овера по окончанию дней

    public void totalGame(){
        if(proekt>=100&&day>=5){
            resultat="Вы выйграли! Молодец! У Вас хорошее будущее! ";
            removeButton();
            textArea.setText(message + resultat);

            textArea.setText(message);
        }else if(proekt<100&&day>=5){
            resultat="Простите, но проект не закончен. Начальник узнал что вы пишете на Java и выгнал Вас, а без портфолио Вы не устроитесь на работу \n"+
                    "Да и жена Вас скорее всего бросит. Конец. Game Over";
            removeButton();
            textArea.setText(message + resultat);
        }
        message="Ну чтож, всё хорошое в этом мире когда-либо заканчивается, и наша игра не исключение.\n"+
                resultat;
    }

    public void stockElement(){
        shtraf = 0;
        spalilsyaField.setText(String.valueOf(shtraf));
        karma = 0;
        karmaField.setText(String.valueOf(karma));
        proekt = 0;
        proektField.setText(String.valueOf(proekt));
        procent = 5.0;
        step = 0;

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
    final JButton button5 = new JButton();

    JTextField karmaField = new JTextField(3);
    JTextField spalilsyaField = new JTextField(3);
    JTextField proektField = new JTextField(3);

    JLabel image = new JLabel();
}
