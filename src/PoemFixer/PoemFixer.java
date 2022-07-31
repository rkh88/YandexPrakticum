package PoemFixer;

public class PoemFixer {

    public String[] readPoem() {
        return new String[]{
                "   Это кто там ложку «ложит»?",
                "",
                "   ",
                "Знай, такого быть не может!",
                "  Ложку мы на стол кладём,  ",
                "",
                "А тебя – к обеду ждём."
        };
    }

    public String fixPoem(String[] poem) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < poem.length; i++) {
            if (!poem[i].isBlank() && !poem[i].isEmpty()) {
                sb.append(poem[i].trim());
            }
        }
        return sb.toString();// допишите код
    }

    public static void main(String[] args) {
        PoemFixer poemFixer = new PoemFixer();
        String[] poem = poemFixer.readPoem();
        String poemAsString = poemFixer.fixPoem(poem);
        System.out.println(poemAsString);
    }
}
