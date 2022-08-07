/*
package FrequencyMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Practicum {

    public static void main(String[] args) throws IOException {
        Map<String, Integer> frequencyMap = new HashMap<>();

        FileReader reader = new FileReader("result.txt");
        BufferedReader br = new BufferedReader(reader);
        while(br.ready()) {
            String line = br.readLine();
            if(frequencyMap.containsKey(line)) {
                int quantity = Integer.valueOf(++frequencyMap.get(line));
                frequencyMap.put(line, quantity);
            } else {
                frequencyMap.put(line, 1);
            }

        }// читайте файл построчно и сразу обновляйте frequencyMap.

        for(String line : frequencyMap.keySet()) {
            System.out.println(line + ": " + frequencyMap.get(line));
        }// выведите результат в формате "<буква>: <количество>".
        br.close();
    }
}
*/
