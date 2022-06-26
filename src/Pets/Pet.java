package Pets;

public abstract class Pet {

    private int pawsCount;

    private String voice;

    public Pet(int pawsCount, String voice) {
        this.pawsCount = pawsCount;
        this.voice = voice;
    }

    public void sleep() {
        System.out.println("Сплю");
    }

    public void play() {
        System.out.println("Играю");
    }

    public void giveVoice() {
        System.out.println(this.getVoice());
    };

    public int getPawsCount() {
        return pawsCount;
    }

    public String getVoice() {
        return voice;
    }
}
