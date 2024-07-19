package Set;

import java.util.HashSet;

class SetDemo {
    private HashSet<Integer> set;

    public SetDemo() {
        set = new HashSet<>();
    }

    public void add(int value) {
        set.add(value);
        System.out.print("Add: ");
        printSet();
    }

    public void remove(int value) {
        set.remove(value);
        System.out.print("Remove: ");
        printSet();
    }

    public boolean contains(int value) {
        boolean result = set.contains(value);
        System.out.println("Contains " + value + ": " + result);
        return result;
    }

    public void printSet() {
        System.out.println(set);
    }

    public static void main(String[] args) {
        SetDemo setDemo = new SetDemo();
        setDemo.add(1);
        setDemo.add(2);
        setDemo.add(3);
        setDemo.contains(2);
        setDemo.remove(2);
        setDemo.contains(2);
    }
}

// Output
// Add: [1]
// Add: [1, 2]
// Add: [1, 2, 3]
// Contains 2: true
// Remove: [1, 3]
// Contains 2: false