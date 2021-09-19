package graph;

import java.util.*;

public class Graph<T> {
    Map<Node<T>, LinkedList<Node<T>>> vertices = new HashMap<>();

    public Node<T> add(T value){
        Node<T> node = new Node<T>(value);
        vertices.put(node, new LinkedList<>());
        return node;
    }

    public void addEdge(Node<T> vertex1, Node<T> vertex2){
        vertices.get(vertex1).append(vertex2);
    }

    public Set<Node<T>> getNode(T vertex){
        Set<Node<T>> setOfVertices = new HashSet<>();
        setOfVertices.addAll(vertices.keySet());
        return setOfVertices;
    }

    public LinkedList<Node<T>> getNeighbors(Node<T> node){
        return vertices.get(node);
    }

    public int getSize(){
        return vertices.size();
    }


    public List<Node<T>> breadthFirst(Node<T> vertex) throws Exception{
        List<Node<T>> listOfNodes = new ArrayList<>();
        Queue<Node<T>> breadth = new Queue<>();
        Set<Node<T>> visited = new HashSet<>();

        breadth.enqueue(vertex);
        visited.add(vertex);

        while (!breadth.isEmpty()){
            Node<T> front = breadth.dequeue();
            listOfNodes.add(front);
            for (int i = 0; i < vertices.get(front).size(); i++) {
                if(!visited.contains(front)){
                    visited.add(front);
                    breadth.enqueue(front);
                }
            }
        }
        return listOfNodes;
    }

    public void depthFirst(Node<T> node){
        List<Node<T>> visited = new ArrayList<>();
        visited.add(node);
        for (int i = 0; i < vertices.get(node).size(); i++) {
            if(!visited.contains(node)){
                depthFirst(node);
            }
        }
    }

    public void businessTrip(Graph<T> graph, ArrayList<Node<T>> cities){

    }



}
