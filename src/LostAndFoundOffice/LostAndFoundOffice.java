package LostAndFoundOffice;

import java.util.ArrayList;

public class LostAndFoundOffice {
    ArrayList<Object> things = new ArrayList<>();// создайте список things

    public void put(Object object) {
        things.add(object);
    }// реализуйте метод put()

    public boolean check(Object target) {
    // реализуйте метод check()
    if(target == null) {
        return false;
    } else {
        for (Object object : things)
            // логика проверки вещи в списке
            if (object.equals(target)) {
                return true;
            }
    }
    return false;

    }
}
