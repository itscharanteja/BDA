package Stack;

class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        stackArray[++top] = value;
        System.out.print("Push: ");
        printStack();
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int value = stackArray[top--];
        System.out.print("Pop: ");
        printStack();
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.push(4);
        stack.peek();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}

// Output
// Push: 1 
// Push: 1 2 
// Push: 1 2 3 
// Pop: 1 2 
// Push: 1 2 4 
// Pop: 1 2 
// Pop: 1 
// Pop: 