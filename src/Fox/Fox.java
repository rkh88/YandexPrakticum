package Fox;

public class Fox extends Animal {
    private String color;

    public Fox(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String say() {
        return "ow ow ow";
    }

    // научите лису говорить
}
