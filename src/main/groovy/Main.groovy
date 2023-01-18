static void main(String[] args) {

    List<Integer> list = List.of(1, 3, 4, 5, 1, 5, 4, 5, 10)

//  def map = listToMapFirst(list)
  def map = listToMapSecond(list)
//    def map = listToMapThird(list)

    println(map)
}

private static Map<Integer, Integer> listToMapFirst(List<Integer> list) {
    Map<Integer, Integer> map = new HashMap<>()

    list.forEach(e -> {
        if (!map.containsKey(e)) map.put(e, 1)
        else map.put(e, map.get(e) + 1)
    })
    map
}

private static Map<Integer, Integer> listToMapSecond(List<Integer> list) {
    Map<Integer, Integer> map = new HashMap<>()

    for (Integer key : list) {
        if (map.containsKey(key)) {
            map.put(key, map.get(key) + 1)
        }
        map.putIfAbsent(key, 1)
    }
    map
}

private static Map<Integer, Integer> listToMapThird(List<Integer> list) {
    Map<Integer, Integer> map = new HashMap<>()

    for (Integer key : list) {
        if (!map.containsKey(key)) {
            map.put(key, 1)
        } else {
            Integer val = map.get(key) + 1
            map.put(key, val)
        }
    }
    map
}
