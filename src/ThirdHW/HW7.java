package ThirdHW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class HW7 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(); //7.4
        arr.add(4);
        arr.add(2);
        arr.add(8);
        arr.sort((o1, o2) -> o1 - o2);

        ArrayList<Integer> arr2 = new ArrayList<>();    //7.5
        arr2.add(3);
        arr2.add(1);
        arr2.add(9);
        arr.stream().filter((o) -> o > arr2.get(arr2.size()-1)).forEach(System.out::println);

        HashMap<String, String > map = new HashMap<>();    //7.7
        map.put("a","b");
        map.put("c","d");
        System.out.println(map.keySet().stream().collect(Collectors.joining()));

        ArrayList<String> list = new ArrayList<>();    //7.8
        long ans;
        list.add("Dear friend");
        list.add("I hate you)");
        list.add("gg");
        ans = list.stream().filter((o) -> o.length() > 5).map((o) -> o.length()).count();
        System.out.println(ans);

        HashSet<String> hashSet = new HashSet<>();     //7.6
        hashSet.add("Hello");
        hashSet.add("Dear friends");
        ans = hashSet.stream().filter((o) -> {
            int j = 0;
            for (int i = 0; i < o.length(); i++) {
                if(o.charAt(i) == 'a' || o.charAt(i) == 'e' ||
                        o.charAt(i) == 'i' || o.charAt(i) == 'o' || o.charAt(i) == 'u' ||
                        o.charAt(i) == 'A' || o.charAt(i) == 'E' ||
                        o.charAt(i) == 'I' || o.charAt(i) == 'O' || o.charAt(i) == 'U') j++;
            }
            return j > 3;
        }).count();
        System.out.println(ans);
    }

}
