package TypeCasting;

public class Practicum {

        public static void main(String[] args) {
            Pair pair = new Pair("4", 1);
            System.out.println("Координаты игрока на карте:");
            pair.print();
            Integer x = Integer.parseInt((String) pair.getKey());
            Integer y = (Integer) pair.getValue();

            System.out.println();

            Pair stringPair = new Pair("username", 1);
            System.out.println("Чит-код пользователя:");
            stringPair.print();
            String user = (String) stringPair.getKey();
            String cheatCode = stringPair.getValue().toString();
        }



}
