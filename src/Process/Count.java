package Process;


public class Count extends Listener {

    // условие для нового дня
    protected int newDay() {
        if (step >= 5) {
            day++;
            step = 0;
        }
        return day;
    }

    protected void Total() {
        if (day > 7) {
            message = "Ну чтож, всё хорошое в этом мире когда-либо заканчивается, и наша игра не исключение.\n" +
                    resultat;

        }

        if (proekt >= 100) {
            resultat = "Вы выйграли! Молодец! У Вас хорошее будущее! ";
        } else {
            resultat = "Простите, но проект не закончен. Начальник узнал что вы пишете на Java и выгнал Вас, а без портфолио Вы не устроитесь на работу \n" +
                    "Да и жена Вас скорее всего бросит. Конец. Game Over";
        }
    }

    protected String overShtraf() {
        if (shtraf >= 5) {
            resultat = "Начальник пронюхал твои делишки, и выгнал тебя. Game Over";
        }
        return resultat;
    }

    protected String overKarma(){
        if(karma >= 5){
            resultat = "Вы почувствовали знак свыше, что необходимо сходить покурить, даже если Вы не курите. /n" +
                    "Стрельнув сигарету, отходите, и в Вас прилетает метиорит в форме макарон. Game Over";
        }
        return resultat;
    }
    public static void main(String[] args) {
        Game app = new Game();
        app.setVisible(true);
        Listener li = new Listener();
        li.setVisible(true);
    }
}


