package L06.algorithims.datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task08MediumWordFrequencyMap {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String sentenceChain = "Hello world! Hello, Texnoera Academy.";

        String change = sentenceChain.toLowerCase().replaceAll("[^a-z\\s]", "");
        String[] words = change.split("\\s+");

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        String mostFrequent = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }
        System.out.println("Frequently encountered word :  " + mostFrequent + " (" + maxCount + ")");
    }
}
