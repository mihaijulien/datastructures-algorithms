package io.github.mihaijulien.datastructures;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    private List<Node> vertices;

    public Graph(){
        this.vertices = new ArrayList<>();
    }

    // Adds a new vertex without any edges as long as it doesn't exist already
    public void addVertex(String id) {
        if (vertices.contains(id)) {
            return;
        }

        vertices.add(new Node(id));
    }

    // Create an edge between a pair of vertices
    public void addEdge(String idFrom, String idTo){
        Node vertexFrom = new Node(idFrom);
        Node vertexTo = new Node(idTo);

        vertexFrom.addNeighbor(vertexTo);
        vertexTo.addNeighbor(vertexFrom);
    }

    public boolean isEmpty() {
        return vertices.isEmpty();
    }

    class Node{
        private String id;
        private List<Node> neighbors;

        public Node(String id){
            this.id = id;
            this.neighbors = new ArrayList<>();
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void addNeighbor(Node node){
            if(this.neighbors.contains(node)){
                return;
            }
            this.neighbors.add(node);
        }

        public void removeNeighbor(Node node){
            this.neighbors.remove(node);
        }

        public List<Node> getNeighbors(){
            return this.neighbors;
        }
    }
}
