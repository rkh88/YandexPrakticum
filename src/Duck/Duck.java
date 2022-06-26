package Duck;

public abstract class Duck {

    public String name;

    public Duck(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    };

    public void swim() {
        System.out.println("Да, я умею плавать!");
    };

    public void quack() {
        System.out.println("Кря!");
    }
}
