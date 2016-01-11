package Process;


import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {

// создаю скелет фрейма
    private static final long serialVersionUID = 1L;

    public JTextField input = new JTextField();

    public static JTextArea textArea = new JTextArea(10, 30);
    public static JButton button = new JButton("Start Game");
    public static String answer;
    public static String message;
    JButton button2 = new JButton("Enter");
    JButton button3 = new JButton("Enter");



    public Game() {
        super("Max-Javax");
        this.setBounds(700, 550, 400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);


        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 5));
        container.add(textArea);
        container.add(input);
        container.add(button);


        button.addActionListener(e -> {

            String message1 = "Здравствуйте! \n" + "Прежде чем начать эту умопомрачительную игру, просьба ответить на небольшой вопрос.";
            message1 += "На чем вы пишете? "
                    + "\n 1. Java"
                    + "\n 2. PHP (ввести число);"
                    + "\n 3. тетрадь (любое другое)";

            answer = input.getText();
            textArea.setText(message1);
            System.out.println(answer);
            container.remove(button);
            container.add(button2);
            repaint();
        });

//        у второго слушателя включаем свитч, ему передаем параметр (ответ)
//        обрабатываем, и пляшем к третей кнопке или гамовер. Осталось только вывести это
//        azaza
        button2.addActionListener(e -> {
            switch (answer) {
                case "1":
                    message = "Вот и наш ГГ Максим хотел писать на Java, \n однако работа заставляла писать его на PHP. Давайте вместе поможем Максу написать проект на Java? Тогда вперед!";
                    textArea.setText(message);
                    container.add(button3);



                case "2":
                    message = "GAME OVER(без обоснований)";
                    textArea.setText(message);
                    container.add(button);


                case "3":
                    message = "GAME OVER(без обоснований)";
                    textArea.setText(message);
                    container.add(button);

            }
        });
    }




    public static void main (String[] args) {
        Game app = new Game();
        app.setVisible(true);

    }
}

