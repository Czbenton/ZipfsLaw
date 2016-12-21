import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by joe on 12/19/16.
 */
public class SortByFrequency {

    //TODO:

    /***
     * refactor to improve readability, cut out deadwood
     * do something about returning the sorted words and associated counts
     * maybe object or hashmap again?
     * clustering? would have to control for all the single-occurrence words
     */


    public static void sortByFrequency(HashMap<String, Integer> wordOccurrences) {

        //do something with clustering? If words occur the same # of times, maybe related

        ArrayList<Integer> originalCountOrder = new ArrayList<>();
        ArrayList<String> originalWordOrder = new ArrayList<>();

        for (String key : wordOccurrences.keySet()) {
            originalCountOrder.add(wordOccurrences.get(key));
            originalWordOrder.add(key);
        }

        int[] sortedCountOrder = new int[wordOccurrences.size()];

        for (int j = 0; j < wordOccurrences.size(); j++) {
            sortedCountOrder[j] = originalCountOrder.get(j);
        }

        Arrays.sort(sortedCountOrder);

        ArrayList<String> usedWords = new ArrayList<>();
        ArrayList<Integer> usedIndices = new ArrayList<>();

        for (int i = 0; i < originalCountOrder.size(); i++) {
            int positionalIndex = originalCountOrder.indexOf(sortedCountOrder[i]);
            if (usedIndices.contains(positionalIndex)) {
                positionalIndex = i;
            }
            usedIndices.add(positionalIndex);

            int adjustedPositionalIndex = positionalIndex;

            String word = originalWordOrder.get(positionalIndex);
            if (usedWords.contains(word)) {
                word = originalWordOrder.get(adjustedPositionalIndex);
            }

            usedWords.add(word);
            System.out.printf("Word: %s Count: %d Position: %d\n", originalWordOrder.get(adjustedPositionalIndex), sortedCountOrder[i], positionalIndex);
        }

        //return sortedPairs;
    }
}



