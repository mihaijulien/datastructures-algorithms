package io.github.mihaijulien.datastructures.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrieNode{
    private boolean isLeaf;
    private List<TrieNode> children;

    public TrieNode(int CHAR_SIZE){
        this.isLeaf = false;
        this.children = new ArrayList<>(Collections.nCopies(CHAR_SIZE, null));
    }

    public boolean isLeaf() {
        return isLeaf;
    }

    public void setLeaf(boolean leaf) {
        isLeaf = leaf;
    }

    public List<TrieNode> getChildren() {
        return children;
    }
}
