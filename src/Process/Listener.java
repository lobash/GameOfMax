package Process;


import javax.swing.*;
import java.math.*;

public class Listener extends Game {

    // Включаем слушатели, реализация основного игрового процесса.
//    разрабатывается.
    public Listener() {


        //слушатель старт гейма

        button.addActionListener(e -> {
            button.setVisible(false);
            remove(button);
            repaint();
            textArea.setText("Вступительный текст!");

            button5.setVisible(true);
            button5.setText("Work on PHP");

            button2.setVisible(true);
            button2.setText("Work on Java");
            button2.addActionListener(e1 -> {
            });

            button3.setVisible(true);
            button3.setText("Cтырить код из инета");

            button4.setVisible(true);
            button4.setText("Мольба макаронному богу");

        });


        //слушатель кнопки 1
        button5.addActionListener(e1 -> {
            textArea.setText("Начальник видит, что Вы ответственно выполняете свои обязанности. " +
                    "Его бдительность уменьшена ");
            step += 1;
            procent -= 10.0;
            System.out.print(procent + " ");
            System.out.print(step + " ");
        });

//  слушатель кнопки 2
        button2.addActionListener(e2 -> {
            if (procent <= Math.random() * 10) {
                textArea.setText(popitkaPhp +
                        "\n и к счастью, начальник не увидел этого. Так держать!");
                step += 1;
                proekt += Math.random() * 10;
                proektField.setText(String.valueOf(proekt));
//                System.out.println("step = " + step);
//                System.out.println("proekt = " + proekt);
            } else {
                textArea.setText(popitkaPhp + "\n но начальник увидел это. Он явно недоволен.");
                step += 1;
                shtraf += 1;
                spalilsyaField.setText(String.valueOf(shtraf));
//                System.out.print(procent + " ");
//                System.out.print(step + " ");
            }
        });

//        Слушатель кнопки 3
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
        });

//        слушатель на 4 кнопку
        button4.addActionListener(e -> {
            textArea.setText("Вы решили что надо снять с себя негатив, и молча произнесли пастафарианскую мольбу. " +
                    "\n Сразу полегчало");
            karma = 0;
            karmaField.setText(String.valueOf(karma));
        });
    }


}
