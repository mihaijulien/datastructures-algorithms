package io.github.mihaijulien.datastructures;

public class Map<K, V> {
    private static final int MAX_SIZE = 10;

    private int size;
    private Entry<K, V>[] map;

    public Map() {
        size = 0;
        map = new Entry[MAX_SIZE];
    }

    public void put(K key, V value) {
        boolean insert = true;
        if (isFull()) {
            throw new IllegalStateException("Map is full");
        }
        for (int i = 0; i < size; i++) {
            if (key.equals(map[i].getKey())) {
                insert = false;
            }
        }
        if (!isFull() && insert) {
            map[size] = new Entry<>(key, value);
        }
        size++;
    }

    public void remove(K key) {
        for (int i = 0; i < size; i++) {
            if (key.equals(map[i].getKey())) {
                map[i] = null;
                size--;
            }
        }
    }

    public V get(K key) {
        for (int i = 0; i < size; i++) {
            if (map[i].getKey().equals(key)) {
                return map[i].getValue();
            }
        }
        return null;
    }

    public boolean containsKey(K key) {
        for (int i = 0; i < size; i++) {
            if (map[i].getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsValue(V value) {
        for (int i = 0; i < size; i++) {
            if (map[i].getValue().equals(value)) {
                return true;
            }
        }
        return false;
    }

    public boolean isFull() {
        return size == MAX_SIZE;
    }

    public int getSize() {
        return size;
    }


    private static class Entry<K, V> {
        private final K key;
        private final V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}
