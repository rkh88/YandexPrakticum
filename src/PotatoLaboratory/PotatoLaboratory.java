package PotatoLaboratory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PotatoLaboratory {

    public static void main(String[] args) {
        List<Potato> potatoes = List.of(
                new Potato(1, 30, 30, 30),
                new Potato(2, 35, 31, 35),
                new Potato(3, 40, 35, 44),
                new Potato(4, 28, 44, 41),
                new Potato(5, 33, 23, 30),
                new Potato(6, 35, 33, 33),
                new Potato(7, 38, 41, 24)
        );

        List<Potato> fourUnderExperiment = findPotatoesForExperiment(potatoes);

        System.out.println("Картофелины для эксперимента: " + fourUnderExperiment);
    }

    private static List<Potato> findPotatoesForExperiment(List<Potato> potatoes) {
        List<Potato> potatoesForExperiment = new ArrayList<>(); /* Вычислите две самые большие и две самые маленькие картофелины,
           а затем выведите их в порядке от самых маленьких до самых больших.*/
        ArrayList<Potato> mutablePotatoes = new ArrayList<>(potatoes);
        Potato potato1 = Collections.min(mutablePotatoes);
        Potato potato4 = Collections.max(mutablePotatoes);
        mutablePotatoes.remove(potato1);
        mutablePotatoes.remove(potato4);
        Potato potato2 = Collections.min(mutablePotatoes);
        Potato potato3 = Collections.max(mutablePotatoes);
        potatoesForExperiment.add(potato1);
        potatoesForExperiment.add(potato2);
        potatoesForExperiment.add(potato3);
        potatoesForExperiment.add(potato4);
        System.out.println(potato1.id + " " + potato1.calculateAlpha(potato1) + " " + potato2.id + " " + potato2.calculateAlpha(potato2) + " " + potato3.id + " " + potato3.calculateAlpha(potato3) + " " + potato4.id + " " + potato4.calculateAlpha(potato4) + " ");
        return potatoesForExperiment;
    }
}
