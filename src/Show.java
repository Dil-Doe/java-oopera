import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printDirector() {
        System.out.println(director);
    }

    public void printActors() {
        System.out.println("Список актёров спектакля \"" + title + "\":");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor newActor) {
        if (listOfActors.contains(newActor)) {
            System.out.println(newActor + "уже присутствует в спектакле.");
        } else {
            listOfActors.add(newActor);
            System.out.println("Актёр " + newActor + " добавлен.");
        }
    }

    public void replaceActor(String surnameToReplace, Actor newActor) {
        boolean found = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor actor = listOfActors.get(i);
            if (actor.getSurname().equals(surnameToReplace)) {
                listOfActors.set(i, newActor);
                System.out.println("Актёр " + actor + " заменён на " + newActor);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Актёр с фамилией " + surnameToReplace + " не найден.");
        }
    }
}
