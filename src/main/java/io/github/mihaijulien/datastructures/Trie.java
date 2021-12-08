package io.github.mihaijulien.datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Trie {
    private TrieNode root;
    private static final int CHAR_SIZE = 26;

    class TrieNode{
        private boolean isLeaf;
        private List<TrieNode> children;

        public TrieNode(){
            this.isLeaf = false;
            this.children = new ArrayList<>(Collections.nCopies(CHAR_SIZE, null));
        }
    }

    public Trie(){
        this.root = new TrieNode();
    }

    public void insert(String word){
        TrieNode current = this.root;
        for(char c : word.toCharArray()){
            if(current.children.get(c - 'a') == null){
                current.children.set(c - 'a', new TrieNode());
            }
            current = current.children.get(c - 'a');
        }

        current.isLeaf = true;
    }

    public boolean search(String word){
        TrieNode current = this.root;
        for(char c : word.toCharArray()){
            current = current.children.get(c - 'a');
            if(current == null){
                return false;
            }
        }
        return current.isLeaf;
    }
}
