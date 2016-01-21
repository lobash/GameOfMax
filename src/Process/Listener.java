package Process;


import javax.swing.*;
import java.math.*;

public class Listener extends Game {

// Включаем слушатели, реализация основного игрового процесса.
//    разрабатывается.
    public Listener() {
        ;
        button.addActionListener(e -> {
            remove(button);

            textArea.setText("Вступительный текст!");

            button5.setVisible(true);
            button5.setText("пятая кнопка");

            button2.setVisible(true);
            button2.setText("Work in PHP");
            button2.addActionListener(e1 -> {
                 double randInt = Math.random()*10;
                if( randInt <= 4.0){
                    textArea.setText("ух как весело писать на пыхе!");
                    System.out.println(randInt);
                }else{
                    textArea.setText("Невесело:(");
                }
//                karma +=1;
//                karmaField.setText(String.valueOf(karma));
//                System.out.println(karma);
            });

            button3.setVisible(true);
            button3.setText("Cтырить код из инета");

            button4.setVisible(true);
            button4.setText("Мольба макаронному богу");



        button.addActionListener(e2 -> {
            textArea.setText("asd");
        });
        });
        }


}
