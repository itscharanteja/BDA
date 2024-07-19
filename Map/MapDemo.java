
package Map;

import java.util.HashMap;

class MapDemo {
    private HashMap<Integer, String> map;

    public MapDemo() {
        map = new HashMap<>();
    }

    public void put(int key, String value) {
        map.put(key, value);
        System.out.print("Put: ");
        printMap();
    }

    public void remove(int key) {
        map.remove(key);
        System.out.print("Remove: ");
        printMap();
    }

    public String get(int key) {
        String value = map.get(key);
        System.out.println("Get key " + key + ": " + value);
        return value;
    }

    public boolean containsKey(int key) {
        boolean result = map.containsKey(key);
        System.out.println("Contains key " + key + ": " + result);
        return result;
    }

    public void printMap() {
        System.out.println(map);
    }

    public static void main(String[] args) {
        MapDemo mapDemo = new MapDemo();
        mapDemo.put(1, "One");
        mapDemo.put(2, "Two");
        mapDemo.put(3, "Three");
        mapDemo.get(2);
        mapDemo.containsKey(2);
        mapDemo.remove(2);
        mapDemo.containsKey(2);
    }
}

//output:
// Put: {1=One}
// Put: {1=One, 2=Two}
// Put: {1=One, 2=Two, 3=Three}
// Get key 2: Two
// Contains key 2: true
// Remove: {1=One, 3=Three}
// Contains key 2: false