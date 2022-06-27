package MovieTheatre;

import java.util.List;

public abstract class Calculator {

    private Calculator() {};

    public static double calculate(List<MediaItem> mediaItems) {
        // Напишите реализацию метода, который будет возвращать общее количество дней,
        // потраченных на просмотр фильмов и сериалов
        double totalMinutes = 0;
        double totalDays = 0;
        for(MediaItem mediaItem : mediaItems) {
            if(mediaItem instanceof Movie) {
                totalMinutes += mediaItem.getRuntime();
            } else if (mediaItem instanceof Series) {
                totalMinutes += mediaItem.getRuntime() * ((Series) mediaItem).getSeriesCount();
            }

        }
        totalDays = totalMinutes/((double) 24 * (double) 60);
        return totalDays;
    }

}
