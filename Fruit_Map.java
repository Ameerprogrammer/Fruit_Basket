import java.util.HashMap;
import java.util.Map;

public class Leetcode {

    public Map<String, Integer> countFruits(String[] basket) {
        //create the instance of the map
        Map<String, Integer> map = new HashMap<>();

        //loop through each fruit in the basket
        for(int i = 0; i < basket.length; i++) {
            //current contents of the basket
            String fruit = basket[i];

            if (map.containsKey(fruit)) {
                //already seen element, add 1 to count the element
                map.put(fruit, map.get(fruit) + 1);
            } else {
                //first time seeing element, so add 1
                map.put(fruit, 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        Leetcode Leetcode1 = new Leetcode();
        // Sample basket input
        String[] basket = {"apple", "banana", "apple", "orange", "banana", "apple"};

        // Call the method and store result
        Map<String, Integer> result = Leetcode1.countFruits(basket);

        // Print the result
        System.out.println("Output: " + result);
    }
}