package MovieTheatre;

public class Movie implements MediaItem {

    private final String title;
    private final int runtime;

    public Movie(String title, int runtime) {
        this.title = title;
        this.runtime = runtime;
    }

    @Override
    public int getRuntime() {
        return runtime;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", runtime=" + runtime +
                '}';
    }
}
