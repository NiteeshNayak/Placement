//Assignment-2
import java.util.HashMap;
import java.util.Map;

public class MostFrequentRating {
    public static void main(String[] args) {
        int[] ratings = {4, 2, 5, 3, 4, 1, 4, 3, 5, 3, 3}; // Example  ratings , rating are in range of 0-5

        Map<Integer, Integer> frequencyMap = new HashMap<>();   //to store frequencies of each rating
        int mostFrequentRating = ratings[0];//taking first element as frequent rating
        int maxCount = 0;//for tracking most frequent rating

       
        for (int i = 0; i < ratings.length; i++) {
            int rating = ratings[i];

            if (frequencyMap.containsKey(rating)) { //if rating already in the map then increment its rating
                frequencyMap.put(rating, frequencyMap.get(rating) + 1);
            } else {    
                frequencyMap.put(rating, 1);
            }

            if (frequencyMap.get(rating) > maxCount) {
                maxCount = frequencyMap.get(rating);
                mostFrequentRating = rating;
            }
        }

        System.out.println("The most frequently occurring rating is: " + mostFrequentRating);
    }
}
