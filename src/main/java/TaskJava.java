import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskJava {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 4, 5, 1, 5, 4, 6, 10, 3);
        Map<Integer, Integer> map1 = listToMapFirst(list);
        Map<Integer, Integer> map2 = listToMapSecond(list);
        Map<Integer, Integer> map3 = listToMapThird(list);

        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map3);
    }

    private static Map<Integer, Integer> listToMapFirst(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();

        list.forEach(e -> {
            if (!map.containsKey(e)) map.putIfAbsent(e, 1);
            else map.put(e, map.get(e) + 1);
        });
        return map;
    }

    private static Map<Integer, Integer> listToMapSecond(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer key : list) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            }
            map.putIfAbsent(key, 1);
        }
        return map;
    }

    private static Map<Integer, Integer> listToMapThird(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer key : list)
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                Integer val = map.get(key) + 1;
                map.put(key, val);
            }
        return map;
    }
}