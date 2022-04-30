package lesson10;

import java.util.*;

public class ArrayL <E> implements List <E> {

    private E[] values;

    public ArrayL() {
        values = (E[]) new Object[0];
    }

    @Override
    public String toString() {
        return Arrays.toString(values);
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean add(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        } return false;
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public E remove(int index) {
        E[] temp =values;
        values = (E[]) new Object[temp.length -1];
        System.arraycopy(
                temp, 0, values, 0, index);
        int amountElemAfterIndex = temp.length - index -1;
        System.arraycopy(
                temp, index +1, values, index, amountElemAfterIndex);
        return values[index];
    }

    @Override
    public E set(int index, E element) {
        return values[index] = element;
    }

    @Override
    public Iterator <E> iterator() {
        return  new ArrayIterator <>(values);
    }

    @Override
    public void add(int index, E element) {
        E[] temp = values;
        values = (E[]) new Object[temp.length + 1];
        System.arraycopy(temp, 0, values, 0, index+1);
        int amountElemAfterIndex = temp.length - index;
        System.arraycopy(temp, index, values, index+1, amountElemAfterIndex);
        values[index+1] = element;
    }

    @Override
    public int lastIndexOf(Object o) {
        return lastIndexOfRange(o, 0, values.length);
    }

    int lastIndexOfRange(Object o, int start, int end) {
        Object[] es = values;
        if (o == null) {
            for (int i = end - 1; i >= start; i--) {
                if (es[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = end - 1; i >= start; i--) {
                if (o.equals(es[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public int indexOf(Object o) {
        return indexOfRange(o, 0, values.length);
    }

    int indexOfRange(Object o, int start, int end) {
        Object[] es = values;
        if (o == null) {
            for (int i = start; i < end; i++) {
                if (es[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = start; i < end; i++) {
                if (o.equals(es[i])) {
                    return i;
                }
            }
        }
        return -1;
    }


    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
    }
