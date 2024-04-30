package io.github.mihaijulien.datastructures;


/**
 * A skip list (or skiplist) is a probabilistic data structure that allows O(log n) average
 * complexity for search as well as O(log n) average complexity for insertion within an ordered
 * sequence of n elements. Thus, it can get the best features of a sorted array (for searching)
 * while maintaining a linked list-like structure that allows insertion, which is not possible with
 * a static array.
 *  | 4 | --------------> |___| --------------------------------------> |   |
 *  | 3 | --------------> |___| --------------------------------------> |   |
 *  | 2 | --------------> |___| --------------> |____|----------------> |   |
 *  | 1 | --------------> |___| --------------> |____|----------------> |   |
 *  | 0 | ---> | 3 | ---> | 5 | ---> | 7 | ---> | 12 | ---> | 13 | ---> |   |
 *
 *
 */
public class SkipList<T> {

    public static class Node<T> {
        private T value;
        /* Array to hold pointers to node of different level */
        Node<T>[] forward;

        public Node(T value, int level){
            this.value = value;
            this.forward = new Node[level + 1];
        }
    }
}
