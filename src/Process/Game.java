package Process;


import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Game extends Spisok {


    // Добавляю элементы фрейма, настроиваю

    public Game() {

        createView();
        this.setSize(900, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

    }


    //  Создание скелета

    private void createView() {

//      Создание GridBagLayout

        getContentPane().add(panelMain);

        panelMain.add(panel);
        panelMain.setBackground(Color.darkGray);


//        Устанавливаем основное текстовое поле
        c.gridy = 0;
        c.gridx = 0;

        c.fill = GridBagConstraints.BOTH;

        c.weightx = 1.0;
        c.weighty = 1.0;

        c.gridwidth = 3;
        c.gridheight = 4;

        c.ipadx = 120;
        c.ipady = 100;


        panel.add(textArea, c);

//      Настраиваю текстАрею

        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        textArea.setEditable(true);
        textArea.setText(message);
        Border border = new LineBorder(Color.CYAN, 3);
        textArea.setBorder(border);
        panel.add(textArea, c);
        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(scrollPane, c);



        c.ipadx = 5;
        c.ipady = 5;

        c.gridwidth = 1;
        c.gridheight = 1;

        c.gridy = 5;

        c.insets = new Insets(150, 0, 0, 50);


//        Добавляю кнопки
        c.insets = new Insets(0, 0, 0, 0);
        c.gridy += 2;

        button.setText("Start Game!");
        panel.add(button, c);
        c.gridx++;

        panel.add(button2, c);
        button2.setEnabled(false);
        c.gridx++;

        panel.add(button3, c);
        button3.setEnabled(false);
        c.gridx++;
        c.gridy = 0;

        c.anchor = GridBagConstraints.CENTER;

//         Добавляю нередактируемые текстовые поля, которые являются счетчиками плюс их названия
        panel.add(new JLabel("Негативная карма : "), c);
        c.gridy++;
        panel.add(new JLabel("Спалился раз : "), c);
        c.gridy++;
        panel.add(new JLabel("Проект готов на : "), c);

        c.gridy = 0;
        c.gridx = 4;


        panel.add(karmaField, c);
        karmaField.setBackground(Color.green);
        karmaField.setEditable(false);
        karmaField.setBorder(new LineBorder(Color.black, 1));
        karmaField.setText(String.valueOf(karma));

        c.gridy++;
        panel.add(spalilsyaField, c);
        spalilsyaField.setEditable(false);
        spalilsyaField.setBackground(Color.green);
        spalilsyaField.setBorder(new LineBorder(Color.black, 1));
        spalilsyaField.setText(String.valueOf(shtraf));

        c.gridy++;
        panel.add(proektField, c);
        proektField.setBackground(Color.green);
        proektField.setEditable(false);
        proektField.setBorder(new LineBorder(Color.black, 1));
        proektField.setText(String.valueOf(proekt));

//        Устанавливаем изображение

        c.gridx = 3;
        c.gridy = 4;
        c.gridwidth = 3;
        c.gridheight = 3;

        image.setIcon(new ImageIcon(getClass().getResource("/Image/kot_pilot.jpg")));
        panel.add(image, c);

//        button.addActionListener(e -> {
//            message = "охтыжёпт";
//            textArea.setText(message);
//            step++;
//        });


    }

    public static void main(String[] args) {
        Game app = new Game();
        app.setVisible(true);
    }


//      привязываем слушателя к первой кнопке

//        button.addActionListener(e -> {
//            message = "Здравствуйте! \n" + "Прежде чем начать эту умопомрачительную игру, просьба ответить на небольшой вопрос.";
//            message += "На чем вы пишете? (ввести число) "
//                    + "\n A. Java"
//                    + "\n B. PHP ;"
//                    + "\n C. тетрадь (любое другое)";
//
////          обрабатываем ответ, выводим следующую кнопку
//
//            answer = input.getText();
//            textArea.setText(message);
//            System.out.println(answer);
//            remove(button);
//            add(button2);
//            add(input);
//            repaint();
//        });
//
//    /* у второго слушателя включаем сверку на ответ, обрабатываем,
//       и пляшем к третей кнопке или гамовер с ресетом. */
//
//        button2.addActionListener(e -> {
//            answer = input.getText();
//            System.out.println(answer); //проверка введенного значения
//
//
//            if (answer.equals("A")) {
//                message = "Вот и наш ГГ Максим хотел писать на Java, \n однако работа заставляла писать его на PHP. Давайте вместе поможем Максу написать проект на Java? Тогда вперед!";
//                textArea.setText(message);
//                add(button3);
//                remove(button2);
//                answer="";
//
//            } else {
//                message = "GAME OVER(без обоснований222)";
//                textArea.setText(message);
////                container.add(button);
////                container.remove(button2);
//            }
//
//        });
//
//        button3.addActionListener(e -> {
//
//        });
//    }


}

