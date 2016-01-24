package Process;


import javax.swing.*;

public class Listener extends Game {

    // Включаем слушатели, реализация основного игрового процесса.

    public Listener() {

        //слушатель старт гейма button

        button.addActionListener(e -> {
            button.setVisible(false);
            remove(button);
            repaint();
            textArea.setText(
                    "Кстати, у Вас на всё провсё 5 дней.\n" +
                    "В день, Вы можете сделать 5 действий. \n" +
                    "Каждый день вся лояльность начальника сбрасывается.\n" +
                    "Ну, а теперь точно начнем!!!");
            stockElement();
            editColor();

//      Добавляем кнопки и обзываем их

            button1.setVisible(true);
            button1.setText("Work on PHP");

            button2.setVisible(true);
            button2.setText("Work on Javа");

            button3.setVisible(true);
            button3.setText("Cтырить код из инета");

            button4.setVisible(true);
            button4.setText("Мольба макаронному богу");
        });


        //слушатель кнопки button1 для php

        button1.addActionListener(e1 -> {
            textArea.setText("Начальник видит, что Вы ответственно выполняете свои обязанности. " +
                    "Его бдительность уменьшена ");
            step += 1;
            procent -= 1.0;
            newDay();
            totalGame();
            editColor();
            image.setIcon(new ImageIcon(getClass().getResource("/Image/php_kot.jpg")));
        });

//  слушатель кнопки button2 для Java
        button2.addActionListener(e2 -> {
            if (procent <= Math.random() * 10) {
                textArea.setText(popitkaJava +
                        "\n и, к счастью, начальник не увидел этого. Так держать!");
                step += 1;
                proekt += Math.random() * 10;
                proektField.setText(String.valueOf(proekt));
                image.setIcon(new ImageIcon(getClass().getResource("/Image/up.jpg")));

            } else {
                textArea.setText(popitkaJava + "\n но начальник увидел это. Он явно недоволен.");
                step += 1;
                shtraf += 1;
                shtrafField.setText(String.valueOf(shtraf));
                image.setIcon(new ImageIcon(getClass().getResource("/Image/palevo.jpg")));
            }

            newDay();
            shtrafGameOver();
            totalGame();
            editColor();
        });

//        Слушатель кнопки button3 для плагиата
        button3.addActionListener(e -> {
            if (procent <= Math.random() * 10) {
                textArea.setText(popitkaPlagiat + "\n Ещё и начальник заметил, отругал. " +
                        "\n Теперь он стал ещё больше чесаться в твою сторону");
                step += 1;
                shtraf += 1;
                procent += 2;
                karma += 1;
                shtrafField.setText(String.valueOf(shtraf));
                karmaField.setText(String.valueOf(karma));
            } else {
                textArea.setText(popitkaPlagiat + "\n Но тем не менее свой кусок кода Вы урвали");
                step += 1;
                proekt += Math.abs(Math.random() * 15);
                proektField.setText(String.valueOf(proekt));
            }

            image.setIcon(new ImageIcon(getClass().getResource("/Image/stid.jpg")));
            newDay();
            totalGame();
            shtrafGameOver();
            karmaGameOver();
            editColor();
        });

//        слушатель на button4 кнопку для мольбы

        button4.addActionListener(e -> {
            textArea.setText("Вы решили, что надо снять с себя негатив, и молча произнесли пастафарианскую мольбу. " +
                    "\n Сразу полегчало");
            karma = 0;
            step += 1;
            karmaField.setText(String.valueOf(karma));
            image.setIcon(new ImageIcon(getClass().getResource("/Image/molilsa.jpg")));

            newDay();
            totalGame();
        });

    }

    public static void main(String[] args) {

        Listener li = new Listener();
        li.setVisible(true);

    }
}