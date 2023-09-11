package com.example.iterator;

/**
 * @author jackwu
 */
public class NameRepository<T> implements Container<T> {

    private T[] names;

    public NameRepository(T[] names) {
        this.names = names;
    }

    @Override
    public Iterator<T> getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<T>{

        private int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public T next() {
            return hasNext() ? names[index++] : null;
        }
    }
}
