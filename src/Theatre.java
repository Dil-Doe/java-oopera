import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {

        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 180);
        Actor actor2 = new Actor("Мария", "Петрова", Gender.FEMALE, 170);
        Actor actor3 = new Actor("Сергей", "Сидоров", Gender.MALE, 175);

        Director director1 = new Director("Алексей", "Александров", Gender.MALE, 10);
        Director director2 = new Director("Елена", "Еленова", Gender.FEMALE, 8);

        String musicAuthor = "Пётр Чайковский";
        String choreographer = "Анна Каренина";

        Show play = new Show("Городские истории", 120, director1, new ArrayList<>());
        Opera opera = new Opera("Русская опера", 150, director2, new ArrayList<>(), musicAuthor,
                "Солнцу красному слава! Слава!\n" + "Слава в небе у нас!", 30);
        Ballet ballet = new Ballet("Щелкунчик", 130, director1, new ArrayList<>(), musicAuthor,
                "Сад перед замком владетельной принцессы.\n" + "На лужайке веселится молодежь.", choreographer);

        play.addActor(actor1);
        play.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        System.out.println();
        play.printActors();
        System.out.println();
        opera.printActors();
        System.out.println();
        ballet.printActors();
        System.out.println();

        Actor newActor = new Actor("Анна", "Новикова", Gender.FEMALE, 165);
        play.replaceActor("Иванов", newActor);

        System.out.println();
        play.printActors();
        System.out.println();

        ballet.replaceActor("Пупкин", actor2);
        System.out.println();

        System.out.println("Либретто оперы:");
        opera.printLibretto();
        System.out.println();
        System.out.println("Либретто балета:");
        ballet.printLibretto();
    }
}

