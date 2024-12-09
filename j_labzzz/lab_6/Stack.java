public class Stack<T> {
    private T[] data;
    private int size;
    private int capacity;

    @SuppressWarnings("unchecked")
    public Stack(int capacity) {
        this.capacity = capacity;
        data = (T[]) new Object[capacity];
        size = 0;
    }

    public void push(T element) {
        if (size == capacity) {
            System.out.println("Stack is full");
        }else{
            data[size++] = element;
        }
        
    }

    public T peek() {
        if (size == 0) {
            System.out.println("Stack is empty");
            return data[size];
        } else{
        return data[size - 1];
        }
    }

    public T pop() {
        if (size == 0) {
            System.out.println("Stack is empty");
            return data[size];
        } else{
        T element = data[--size];
        data[size] = null; 
        return element;
        }
    }
    
}
