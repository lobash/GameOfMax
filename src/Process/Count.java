package Process;


public class Count extends Game {

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

    protected int overShtraf(){
//        if (shtraf >= 5){

        }
    }

}
