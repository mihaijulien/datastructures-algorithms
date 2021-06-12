package mihaijulien.eu.datastructures;

import java.util.NoSuchElementException;

/**
 * A Min-Heap is a complete binary tree in which the value in each internal node is smaller than or equal to the values
 * in the children of that node.
 * <p>Example:
 *
 * <pre>
 * Array visualization:
 * [1,3,2,6,5,4]
 *
 * Tree visualization:
 *       1
 *    /    \
 *   3      2
 *  / \    /
 * 6   5  4
 * </pre>
 *
 * @see <a
 *  *     href="https://en.wikipedia.org/wiki/Min-max_heap">https://en.wikipedia.org/wiki/Min-max_heap</a>
 */
public class MinHeap<T extends Comparable<T>> {

    private T[] heap;
    private int size;
    private static final int MAX_SIZE = 20;

    public MinHeap() {
        this.heap = (T[]) new Comparable[MAX_SIZE];
        this.size = 0;
    }

    /**
     * Returns the current size of the heap
     *
     * @return the size of the heap
     */
    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    private int getParent(int position){
        return (position - 1)/2;
    }

    private int getLeftChild(int position){
        return 2*position + 1;
    }

    private int getRightChild(int position){
        return 2*position + 2;
    }

    private void swap(int position1, int position2){
        T temp = heap[position1];
        heap[position1] = heap[position2];
        heap[position2] = temp;
    }

    private boolean isLeaf(int position){
        return position > size / 2;
    }

    /**
     * Insert a new element in the heap.
     *
     * @param data the new element to insert
     */
    public void insert(T data){
        if(size >= MAX_SIZE){
            throw new IllegalStateException("Heap is full");
        }
        heap[size] = data;
        int currentItem = size;
        while(heap[getParent(currentItem)].compareTo(heap[currentItem]) > 0){
            swap(getParent(currentItem),currentItem);
            currentItem = getParent(currentItem);
        }
        size++;
    }

    /**
     * Deletes the minimum element.
     *
     * @return the deleted element
     *
     * @throws NoSuchElementException if the heap is empty
     */
    public T delete(){
        if(isEmpty()){
            throw new NoSuchElementException("Heap is already empty");
        }
        T itemPopped = heap[0];
        size--;
        heap[0] = heap[size];
        minHeapify(0);
        return itemPopped;
    }

    private void minHeapify(int position){
        int left  = getLeftChild(position);
        int right = getRightChild(position);
        int smallest = position;
        if (left < size && heap[left].compareTo(heap[smallest]) < 0){
            smallest = left;
        } if(right < size && heap[right].compareTo(heap[smallest]) < 0){
            smallest = right;
        } if(smallest != position){
            swap(position, smallest);
            minHeapify(smallest);
        }
    }

    /**
     * Prints the heap.
     */
    public void printHeap() {
        for (int i = 0; i < (size / 2); i++) {
            System.out.print("Parent : " + heap[i]);
            if (getLeftChild(i) < size)
                System.out.print(" Left : " + heap[getLeftChild(i)]);
            if (getRightChild(i) < size)
                System.out.print(" Right :" + heap[getRightChild(i)]);
            System.out.println();
        }
    }
}
