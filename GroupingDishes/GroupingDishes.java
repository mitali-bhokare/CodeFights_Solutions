package CodeFighters;

import java.util.*;

public class GroupingDishes {

    public static void main(String[] args) {
        String[][] dishes = {{"Salad", "Tomato", "Cucumber", "Salad", "Sauce"},
                {"Pizza", "Tomato", "Sausage", "Sauce", "Dough"},
                {"Quesadilla", "Chicken", "Cheese", "Sauce"},
                {"Sandwich", "Salad", "Bread", "Tomato", "Cheese"}};

        GroupingDishes gd = new GroupingDishes();
        gd.groupingDishes(dishes);


    }

    public String[][] groupingDishes(String[][] dishes) {

        Map<String, List<String>> dishMap = new HashMap<>();
        //Populating the HashMap
        for (int i = 0; i < dishes.length; i++) {
            for (int j = 1; j < dishes[i].length; j++) {
                if (!dishMap.containsKey(dishes[i][j])) {
                    dishMap.put(dishes[i][j], new ArrayList<>());
                }
                dishMap.get(dishes[i][j]).add(dishes[i][0]);
            }
        }

        String[][] finalList = new String[dishMap.size()][];
        List<List<String>> temp = new ArrayList<>();
        //List for each key
        List<String> dishesList;
        List<String> ingredients = new ArrayList<>(dishMap.keySet());
        Collections.sort(ingredients);
        for (String key : ingredients) {
            if (dishMap.get(key).size() > 1) {
                dishesList = new ArrayList<>();
                dishesList.add(key);
                Collections.sort(dishMap.get(key));
                //System.out.println("Value of " + key + " is: " + dishMap.get(key));

                int size = dishMap.get(key).size();
                int j = 0;
                while (size > 0) {
                    dishesList.add(dishMap.get(key).get(j));
                    j++;
                    size--;
                }
                temp.add(new ArrayList<>(dishesList));
            }

        }

       System.out.println("Temp List: " + temp);

        //Preparing the final array to be returned
        for (int i = 0; i < temp.size(); i++) {
            String[] current = new String[temp.get(i).size()];
            for (int j = 0; j < current.length; j++) {
                current[j] = temp.get(i).get(j);
                System.out.println("Final: "+temp.get(i).get(j));
            }
            finalList[i] = current;

        }

        return finalList;
    }
}
