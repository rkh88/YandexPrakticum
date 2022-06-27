package MovieTheatre;

public class Series implements MediaItem {

    private final String title;
    private final int averageRuntime;
    private final int seriesCount;

    public Series(String title, int averageRuntime, int seriesCount) {
        this.title = title;
        this.averageRuntime = averageRuntime;
        this.seriesCount = seriesCount;
    }

    @Override
    public int getRuntime() {
        return averageRuntime;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getSeriesCount() {
        return seriesCount;
    }

    @Override
    public String toString() {
        return "Series{" +
                "title='" + title + '\'' +
                ", averageRuntime=" + averageRuntime +
                ", seriesCount=" + seriesCount +
                '}';
    }
}
