package Forest;

import java.util.List;


public class Forest {
    private List<MountainHare> hares;
    private static String season;

    public Forest(List<MountainHare> hares, String season) {
        this.hares = hares;
        this.season = season;
        if(season.equals("Зима")) {
            MountainHare.setColor("белый");
        } else if(season.equals("Лето")) {
            MountainHare.setColor("серо-рыжий");
        }
    }

    public static void setSeason(String newSeason) {
        season = newSeason;
        if(newSeason.equals("Зима")) {
            MountainHare.setColor("белый");
        } else if(newSeason.equals("Лето")) {
            MountainHare.setColor("серо-рыжий");
        }

    }

    public void printHares() {
        for(MountainHare hare : this.hares) {
            System.out.println(hare.toString());
        }
    }


    // объявите недостающие переменные и добавьте конструктор

    // добавьте метод setSeason(String newSeason)
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков

    // добавьте метод printHares()

}
