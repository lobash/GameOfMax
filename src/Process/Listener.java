package Process;


public class Listener extends Game {

    // Включаем слушатели, реализация основного игрового процесса.
//    разрабатывается.
    public Listener() {


        //слушатель старт гейма button

        button.addActionListener(e -> {
            button.setVisible(false);
            remove(button);
            repaint();
            textArea.setText("Вы - программист,работающий на PHP. " +
                    "Однако, Вы не отчаиваетесь, и желаете изучать Java, но Ваше начальство разумеется против. " +
                    "Итак, Ваша основная цель - привести проект к 100% готовности." +
                    "Вперед!!!");
            stockElement();


//      Добавляем кнопку button5 для php
            button5.setVisible(true);
            button5.setText("Work on PHP");
//      Добавляем кнопку button2 для Java

            button2.setVisible(true);
            button2.setText("Work on Java");

            //      Добавляем кнопку button3 для плагиата


            button3.setVisible(true);
            button3.setText("Cтырить код из инета");

            //      Добавляем кнопку button4 для мольбы

            button4.setVisible(true);
            button4.setText("Мольба макаронному богу");

        });


        //слушатель кнопки b5 для php
        button5.addActionListener(e1 -> {
            textArea.setText("Начальник видит, что Вы ответственно выполняете свои обязанности. " +
                    "Его бдительность уменьшена ");
            step += 1;
            procent -= 1.0;
            newDay();
            totalGame();
            System.out.println("step = "+step);
            System.out.println("day = " + day);
            System.out.println(" ");
        });

//  слушатель кнопки b2 для Java
        button2.addActionListener(e2 -> {
            if (procent <= Math.random() * 10) {
                textArea.setText(popitkaJava +
                        "\n и, к счастью, начальник не увидел этого. Так держать!");
                step += 1;
                proekt += Math.random() * 10;
                proektField.setText(String.valueOf(proekt));

            } else {
                textArea.setText(popitkaJava + "\n но начальник увидел это. Он явно недоволен.");
                step += 1;
                shtraf += 1;
                spalilsyaField.setText(String.valueOf(shtraf));
            }

//            счетчики
            newDay();
            shtrafGameOver();
            totalGame();
            System.out.println("step = "+ step);
            System.out.println("day = " + day);
            System.out.println(" ");
        });

//        Слушатель кнопки b3 для плагиата
        button3.addActionListener(e -> {
            if (procent <= Math.random() * 10) {
                textArea.setText(popitkaPlagiat + "\n Ещё и начальник заметил, отругал. " +
                        "\n Теперь он стал ещё больше чесаться в твою сторону");
                step += 1;
                shtraf += 1;
                procent += 2;
                karma += 1;
                spalilsyaField.setText(String.valueOf(shtraf));
                karmaField.setText(String.valueOf(karma));
            } else {
                textArea.setText(popitkaPlagiat + "\n Но тем не менее свой кусок кода Вы урвали");
                step += 1;
                proekt += Math.abs(Math.random() * 15);
                proektField.setText(String.valueOf(proekt));
            }

            newDay();
            totalGame();
            shtrafGameOver();
            karmaGameOver();
            System.out.println("step = "+step);
            System.out.println("day = " + day);
            System.out.println(" ");
        });

//        слушатель на b4 кнопку для мольбы

        button4.addActionListener(e -> {
            textArea.setText("Вы решили, что надо снять с себя негатив, и молча произнесли пастафарианскую мольбу. " +
                    "\n Сразу полегчало");
            karma = 0;
            step += 1;
            karmaField.setText(String.valueOf(karma));

            newDay();
            totalGame();

            System.out.println("step = "+step);
            System.out.println("day = " + day);
            System.out.println(" ");
        });

    }

    public static void main(String[] args) {

        Listener li = new Listener();
        li.setVisible(true);


    }
}
