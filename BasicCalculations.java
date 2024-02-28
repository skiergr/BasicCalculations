import java.util.HashMap;
import java.util.Map;

public class BasicCalculations {

    // Method to calculate the Mode of an array
    public static int mode(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int mode = 0;
        int maxFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mode = entry.getKey();
            }
        }

        return mode;
    }

    // Method to calculate the Range of an array
    public static int range(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int num : array) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        return max - min;
    }
}
