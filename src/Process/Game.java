package Process;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Game extends Spisok {


    // Добавляю элементы фрейма, настроиваю

    public Game() {
        createView();
        this.setSize(1000, 450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }


    //  Создание скелета

    private void createView() {

//      Создание GridBagLayout

        getContentPane().add(panelMain);

        panelMain.add(panel);
        panelMain.setBackground(Color.darkGray);
        panel.setSize(900, 400);

//        Устанавливаем основное текстовое поле
        c.gridy = 0;
        c.gridx = 0;

        c.fill = GridBagConstraints.BOTH;

        c.weightx = 1.0;
        c.weighty = 1.0;

        c.gridwidth = 3;
        c.gridheight = 6;

        c.ipadx = 20;
        c.ipady = 10;

        panel.add(textArea, c);

//      Настраиваю текстАрею

        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        textArea.setEditable(false);
        textArea.setText("Вы - программист,работающий на PHP. " +
                "Однако, Вы не отчаиваетесь, и желаете изучать Java, но Ваше начальство разумеется против. " +
                "Итак, Ваша основная цель - привести проект к 100% готовности." +
                "Вперед!!!");
        Border border = new LineBorder(Color.CYAN, 3);
        textArea.setBorder(border);
        panel.add(textArea, c);
        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(scrollPane, c);

        c.gridwidth = 1;
        c.gridheight = 1;
        c.gridy = 5;
        c.insets = new Insets(150, 0, 0, 50);


//        Добавляю кнопки
        c.insets = new Insets(0, 0, 0, 0);

        c.gridy += 2;
        button1.setVisible(false);
        panel.add(button1, c);
        button.setText("Start New Game!");
        panel.add(button, c);
        c.gridx++;

        panel.add(button2, c);
        button2.setVisible(false);
        c.gridx++;

        panel.add(button3, c);
        button3.setVisible(false);
        c.gridx++;

        panel.add(button4, c);
        button4.setVisible(false);
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
        panel.add(shtrafField, c);
        shtrafField.setEditable(false);
        shtrafField.setBackground(Color.green);
        shtrafField.setBorder(new LineBorder(Color.black, 1));
        shtrafField.setText(String.valueOf(shtraf));

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

    }
}

