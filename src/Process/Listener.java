package Process;


public class Listener extends Game {

// Включаем слушатели, реализация основного игрового процесса.
//    разрабатывается.
    public Listener() {
        button.addActionListener(e -> {
            textArea.setText("Вступительный текст!");
            button2.setEnabled(true);
            button2.setText("Work in PHP");
            button3.setEnabled(true);
            button3.setText("стырить код из инета");
            button.setText("Work in Java");
            karma++;
            karmaField.setText(String.valueOf(karma));

            button2.addActionListener(e1 -> {
                karma += 4;
                karmaField.setText(String.valueOf(karma));
            }); 
        });

        button2.addActionListener(e -> {
            button2.setText("Work on Java");

        });
    }

}
