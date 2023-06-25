public class MockTestQ1 {
    private int maxSize; // maximum size of the stack
    private int top; // index of the top element
    private int[] stackArray; // array to store stack elements

    public MockTestQ1(int size) {
        maxSize = size;
        top = -1;
        stackArray = new int[maxSize];
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full, Can't push element ->Stack Overflow");
            return;
        }
        stackArray[++top] = value;
        System.out.println("Pushed element is: " + value);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, Can't pop element -> Stack Underflow");
            return -1;
        }
        int poppedElement = stackArray[top--];
        System.out.println("Popped element is: " + poppedElement);
        return poppedElement;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        MockTestQ1 stack = new MockTestQ1(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}



