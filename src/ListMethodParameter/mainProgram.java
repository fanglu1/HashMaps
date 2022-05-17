package ListMethodParameter;

import java.util.*;

public class mainProgram {

    public static int returnSize(List list){
        return list.size();
    }
    public static int returnSize(Map map){
        return map.size();
    }
    public static int returnSize(Set set){
        return set.size();
    }
    public static void main(String[] args) {

        List<String> listnames = new ArrayList<>();
        listnames.add("First");
        listnames.add("Second");
        listnames.add("Third");

        System.out.println(returnSize(listnames));

        Map<String, String> mapnames = new HashMap<>();
        mapnames.put("1", "first");
        mapnames.put("2", "second");

        System.out.println(returnSize(mapnames));

        Set<String> setnames = new HashSet<>();
        setnames.add("first");
        setnames.add("first");
        setnames.add("second");
        setnames.add("second");
        setnames.add("second");

        System.out.println(returnSize(setnames));
    }
}