import java.security.KeyStore.Entry;
import java.util.HashMap;

public class Exercises {
    private HashMap<String, Integer> exercises = new HashMap<String, Integer>();

    public void exercise1(HashMap<String, Integer> hashMap, int selector)
    {
        System.out.println("1st exercise: Write a Java program to associate the specified value with the specified key in a HashMap");
        if(selector == 1){
            hashMap.put("Fjord", 1);
            hashMap.put("Jester", 2);
            hashMap.put("Caleb", 3);
        }else if(selector == 2){
            hashMap.put("Veth", 4);
            hashMap.put("Yasha", 5);
            hashMap.put("Caduceus", 6);
            hashMap.put("Beauregard", 7);
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
        System.out.println("Copying everthing from map1 into map2...");
        hashMap2.putAll(hashMap1);
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

    public void exercise5(HashMap<String, Integer> hashMap)
    {
        System.out.println("5th exercise: Write a Java program to check whether a map contains key-value mappings (empty) or not");
        System.out.println(hashMap);
        if(hashMap.isEmpty()){
            System.out.println("The map is empty");
        }else{
            System.out.println("The map is not empty");
        }
        System.out.println();
    }

    public void exercise6(HashMap<String, Integer> hashMap1, HashMap<String, Integer> hashMap2)
    {
        System.out.println("6th exercise: Write a Java program to get a shallow copy of a HashMap instance");
        System.out.println(hashMap1);
        System.out.println(hashMap2);
        System.out.println("Copying everthing from map1 into map2...");
        hashMap2 = (HashMap<String, Integer>) hashMap1.clone();
        System.out.println("Map2: " + hashMap2);
        System.out.println();
    }

    public void exercise7(HashMap<String, Integer> hashMap, String key)
    {
        System.out.println("7th exercise: Write a Java program to test if a map contains a mapping for the specified key");
        System.out.println(hashMap);
        System.out.println("Key we are looking for: " + key);
        if(hashMap.containsKey(key)){
            System.out.println("The map contains the key"); 
        }else{
            System.out.println("The map does not contains the key");
        }
        System.out.println();
    }

    public void exercise8(HashMap<String, Integer> hashMap, Integer value)
    {
        System.out.println("8th exercise: Write a Java program to test if a map contains a mapping for the specified value");
        System.out.println(hashMap);
        System.out.println("The value we are looking for: " + value);
        if(hashMap.containsValue(value)){
            System.out.println("The map contains the value");
        }else{
            System.out.println("The map does not contain the value");
        }
        System.out.println();
    }

    public void exercise9(HashMap<String, Integer> hashMap)
    {
        System.out.println("9th exercise: Write a Java program to create a set view of the mappings contained in a map");
        System.out.println(hashMap);
        System.out.println("Set view of the mappings: " + hashMap.entrySet());
        System.out.println();
    }

    public void exercise10(HashMap<String, Integer> hashMap, String key)
    {
        System.out.println("10th exercise: Write a Java program to get the value of a specified key in a map");
        System.out.println(hashMap);
        System.out.println("We are looking for the value of this key: " + key);
        int value = -1;
        for(HashMap.Entry<String, Integer> entry : hashMap.entrySet()) {
            if(entry.getKey().equals(key)){
                value = entry.getValue();
            }
        }
        if(value == -1){
            System.out.println("The key was not in the map");
        }else{
            System.out.println("The value of the specified key in the map is: " + value);
        }
        System.out.println();
    }

    public void exercise11(HashMap<String, Integer> hashMap)
    {
        System.out.println("11th exercise: Write a Java program to get a set view of the keys contained in this map");
        System.out.println(hashMap);
        System.out.println("The keys of the map are: " + hashMap.keySet());
        System.out.println();
    }
    
    public HashMap<String, Integer> getExercises()
    {
        return exercises;
    }
}