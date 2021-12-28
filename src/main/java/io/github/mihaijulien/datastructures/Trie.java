package io.github.mihaijulien.datastructures;

import io.github.mihaijulien.datastructures.util.TrieNode;

public class Trie {
    private TrieNode root;
    private static final int CHAR_SIZE = 26;

    public Trie(){
        this.root = new TrieNode(CHAR_SIZE);
    }

    public void insert(String word){
        TrieNode current = this.root;
        for(char c : word.toCharArray()){
            if(current.getChildren().get(c - 'a') == null){
                current.getChildren().set(c - 'a', new TrieNode(CHAR_SIZE));
            }
            current = current.getChildren().get(c - 'a');
        }

        current.setLeaf(true);
    }

    public boolean search(String word){
        TrieNode current = this.root;
        for(char c : word.toCharArray()){
            current = current.getChildren().get(c - 'a');
            if(current == null){
                return false;
            }
        }
        return current.isLeaf();
    }
}
