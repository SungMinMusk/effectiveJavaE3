package item13;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
    private PhoneNum[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        System.out.println("---------------");
        System.out.println("Stack constructor");
        this.elements = new PhoneNum[DEFAULT_INITIAL_CAPACITY];
    }

    public PhoneNum[] getElements() {
        return elements;
    }

    public int getSize() {
        return size;
    }

    public void push(PhoneNum e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public PhoneNum pop() {
        if(size == 0) {
            throw new EmptyStackException();
        }
        PhoneNum result = elements[--size];
        elements[size] = null;
        return result;
    }

    private void ensureCapacity() {
        if(elements.length == size) {
            elements = Arrays.copyOf(elements,2 * size + 1);
            System.out.println(elements.length);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (elements[i] != null) {
            stringBuilder.append(elements[i].num);
            stringBuilder.append(",");
            i++;
        }

        return stringBuilder.toString();
    }



    public static Stack copy(Stack st) {
        Stack stack = new Stack();
        stack.size = st.size;
        for (int i = 0; i < st.size; i++) {
            stack.elements[i] = st.elements[i].clone();
        }
        return stack;
    }

}