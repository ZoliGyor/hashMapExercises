import java.util.HashMap;

public class Exercises {
    private HashMap<String, Integer> exercises = new HashMap<String, Integer>();

    public void exercise1(HashMap<String, Integer> hashMap, int selector)
    {
        System.out.println("1st exercise: Write a Java program to associate the specified value with the specified key in a HashMap");
        if(selector == 1){
            hashMap.put("Fjord", 1);
            hashMap.put("Jester", 1);
            hashMap.put("Caleb", 1);
        }else if(selector == 2){
            hashMap.put("Veth", 1);
            hashMap.put("Yasha", 1);
            hashMap.put("Caduceus", 1);
            hashMap.put("Beauregard", 1);
        }
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

    public void exercise3(HashMap<String, Integer> hashMap1, HashMap<String, Integer> hashMap2)
    {
        System.out.println("3rd exercise: Write a Java program to copy all of the mappings from the specified map to another map");
        System.out.println("Map1: " + hashMap1);
        System.out.println("Map2: " + hashMap2);
        System.out.println("Copying everthing from map1 to map2...");
        hashMap2 = (HashMap<String, Integer>) hashMap1.clone();
        System.out.println("Map2: " + hashMap2);
        System.out.println();
    }

    public void exercise4(HashMap<String, Integer> hashMap)
    {
        System.out.println("4th exercise: Write a Java program to remove all of the mappings from a map");
        System.out.println(hashMap);
        hashMap.clear();
        System.out.println(hashMap);
        System.out.println();
    }

    public HashMap<String, Integer> getExercises()
    {
        return exercises;
    }
}