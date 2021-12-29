package io.github.mihaijulien.algorithms.trees;

import io.github.mihaijulien.datastructures.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class LeftView<T extends Comparable<T>> extends BinarySearchTree<T> {

    public void leftView(BinaryNode<T> node){
        if(node == null){
            return;
        }

        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(node);

        BinaryNode<T> current;
        while(!queue.isEmpty()){
            for(int i=0; i<queue.size(); i++){
                current = queue.poll();

                if(i==1){
                    System.out.print(current.getValue() + " ");
                }
                if(current.getLeft() != null){
                    queue.add(current.getLeft());
                }
                if(current.getRight() != null){
                    queue.add(current.getRight());
                }
            }
        }
    }
}
