import java.util.HashMap;

public class Exercises {
    private HashMap<String, Integer> exercises = new HashMap<String, Integer>();

    public void exercise1(HashMap<String, Integer> hashMap)
    {
        System.out.println("1st exercise: Write a Java program to associate the specified value with the specified key in a HashMap");
        hashMap.put("Fjord", 1);
        hashMap.put("Jester", 1);
        hashMap.put("Caleb", 1);
        System.out.println(hashMap);
        System.out.println();
    }

    public void exercise2(HashMap<String, Integer> hashMap)
    {
        System.out.println("2nd exercise: Write a Java program to count the number of key-value (size) mappings in a map");
        System.out.println(hashMap);
        System.out.println("The size of the map is: " + hashMap.size());
        System.out.println();
    }

    public HashMap<String, Integer> getExercises()
    {
        return exercises;
    }
}