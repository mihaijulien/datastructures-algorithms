package io.github.mihaijulien.algorithms.trees;

import io.github.mihaijulien.datastructures.BinarySearchTree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Codec<T extends Comparable<T>> extends BinarySearchTree<T> {

    private String serialize(BinaryNode<T> root, StringBuilder stringBuilder) {
        if (root == null) {
            stringBuilder.append("None,");
        } else {
            stringBuilder.append(root.getValue() + ",");
            serialize(root.getLeft(), stringBuilder);
            serialize(root.getRight(), stringBuilder);
        }
        return stringBuilder.toString();
    }

    // Encodes a tree to a single string.
    public String serialize(BinaryNode<T> root) {
        return serialize(root, new StringBuilder());
    }

    private BinaryNode<T> deserialize(List<String> list) {

        if (list.get(0).equals("None")) {
            list.remove(0);
            return null;
        }

        BinaryNode<T> root = new BinaryNode<T>((T) list.get(0));
        list.remove(0);
        root.setLeft(deserialize(list));
        root.setRight(deserialize(list));

        return root;
    }

    // Decodes the encoded data to tree.
    public BinaryNode<T> deserialize(String data) {
        String[] dataArray = data.split(",");
        List<String> dataList = new LinkedList<>(Arrays.asList(dataArray));
        return deserialize(dataList);
    }
}
