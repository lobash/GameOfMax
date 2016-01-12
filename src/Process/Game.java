package Process;


import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {

// создаю скелет фрейма
    private static final long serialVersionUID = 1L;

    public JTextField input = new JTextField();

    public static JTextArea textArea = new JTextArea(10, 30);

    public static String answer;
    public static String message;

    JButton button = new JButton("Start Game");
    JButton button2 = new JButton("Enter");
    JButton button3 = new JButton("Enter");



    public Game() {
        super("Max-Javax");
        this.setBounds(700, 550, 400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//      настраиваю текстовое поле: недоступно для редактирования, и перенос слов на новую линию
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        textArea.setText("Нажмите Start Game");


        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 5));
        container.add(textArea);
        container.add(input);
        container.add(button);




//      привязываем слушателя к первой кнопке

        button.addActionListener(e -> {
            message = "Здравствуйте! \n" + "Прежде чем начать эту умопомрачительную игру, просьба ответить на небольшой вопрос.";
            message += "На чем вы пишете? (ввести число) "
                    + "\n A. Java"
                    + "\n B. PHP ;"
                    + "\n C. тетрадь (любое другое)";

//          обрабатываем ответ, выводим следующую кнопку

//            answer = input.getText();
            textArea.setText(message);
//            System.out.println(answer);
            container.remove(button);
            container.add(button2);
//            repaint();
        });

    /* у второго слушателя включаем сверку на ответ, обрабатываем,
       и пляшем к третей кнопке или гамовер с ресетом. */

        button2.addActionListener(e -> {
            answer = input.getText();
            System.out.println(answer); //проверка введенного значения


            if (answer.equals ("A")) {
                message = "Вот и наш ГГ Максим хотел писать на Java, \n однако работа заставляла писать его на PHP. Давайте вместе поможем Максу написать проект на Java? Тогда вперед!";
                textArea.setText(message);
                container.add(button3);
            } else {
                message = "GAME OVER(без обоснований222)";
                textArea.setText(message);
                container.add(button);
            }

        });

        button3.addActionListener(e -> {

        });
    }




    public static void main (String[] args) {
        Game app = new Game();
        app.setVisible(true);

    }
}

