package baitap.trienkhaiphuongthuccuaArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
    }

    private void ensurCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E element) {
        for (int i = index; i < elements.length - 1; i++) {

        }
    }

    public boolean add(E e) {
        if (size == elements.length) {
            ensurCapa();
        }
        elements[size++] = e;
        return true;
    }


}
