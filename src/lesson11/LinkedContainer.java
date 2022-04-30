package lesson11;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedContainer<E> implements List<E>,DescendingIterator,Iterable<E> {

    private Node<E> fstNode;
    private Node<E> lstNode;
    private int size = 0;

    public LinkedContainer() {
        lstNode = new Node<>(null,fstNode,null);
        fstNode = new Node<>(null,null,lstNode);
    }

    private class Node<E> {

        private E currentElement;
        private Node<E> nextElement;
        private Node<E> prevElement;

        public Node(E currentElement,  Node<E> prevElement, Node<E> nextElement) {
            this.currentElement = currentElement;
            this.nextElement = nextElement;
            this.prevElement = prevElement;
        }

        public E getCurrentElement() {
            return currentElement;
        }

        public void setCurrentElement(E currentElement) {
            this.currentElement = currentElement;
        }

        public Node<E> getNextElement() {
            return nextElement;
        }

        public void setNextElement(Node<E> nextElement) {
            this.nextElement = nextElement;
        }

        public Node<E> getPrevElement() {
            return prevElement;
        }

        public void setPrevElement(Node<E> prevElement) {
            this.prevElement = prevElement;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean add(E e) {
        linkLast(e);
        return true;
    }

    public void linkLast(E e){
        Node<E> prev = lstNode;
        prev.setCurrentElement(e);
        lstNode = new Node<>(null,prev,null);
        prev.setNextElement(lstNode);
        size++;
    }

    public void linkFirst(E e){
        Node<E> next = fstNode;
        next.setCurrentElement(e);
        fstNode = new Node<>(null,null,next);
        next.setPrevElement(fstNode);
        size++;
    }

    @Override
    public E get(int index) {
        Node<E> target = fstNode.getNextElement();
        for (int i = 0; i <index; i++){
            target = getNextElement(target);
        }
        return target.getCurrentElement();
    }

    private Node<E> getNextElement(Node<E> current){
        return current.getNextElement();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int counter = 0;
            @Override
            public boolean hasNext() {
                return counter < size;
            }
            @Override
            public E next() {
                return get(counter++);
            }
        };
    }

    @Override
    public E set(int index, E element) {
        Node<E> target = fstNode.getNextElement();
        for (int i = 0; i <index; i++){
            target = getNextElement(target);
        }
        E out = target.currentElement;
        target.currentElement = element;
        return out;
    }

    @Override
    public void add(int index, E element) {

        Node<E> target = fstNode.getNextElement();
        for (int i = 0; i < index; i++) {
            target = getNextElement(target);
        }
        Node<E> el = new Node<>(element,target,target.nextElement);
        target.setNextElement(el);
        size++;
    }

    @Override
    public void clear() {
        for (Node<E> x = fstNode; x != null; ) {
            Node<E> next = x.nextElement;
            x.currentElement= null;
            x.nextElement = null;
            x.prevElement = null;
            x = next;
        }
        fstNode = lstNode = null;
        size = 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    @Override
    public int indexOf(Object o) {
        int index = -1;
        if (o == null) {
            for (Node<E> x = fstNode; x != null; x = x.nextElement) {
                if (x.currentElement == null)
                    return index;
                index++;
            }
        } else {
            for (Node<E> x = fstNode; x != null; x = x.nextElement) {
                if (o.equals(x.currentElement))
                    return index;
                index++;
            }
        }
        return -1;
    }

    @Override
    public Iterator descendingIterator() {
        return new Iterator() {
            int  counter = size-1;
            @Override
            public boolean hasNext() {
                return counter >= 0;
            }
            @Override
            public Object next() {
                return get(counter--);
            }
        };
    }




    @Override
    public E remove(int index) {

        return null;
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
    public int lastIndexOf(Object o) {
        return 0;
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
