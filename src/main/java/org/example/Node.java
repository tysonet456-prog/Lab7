package org.example;

import java.util.ArrayList;

public class Node {
    private String name;
    private ArrayList<Node> connectedList = new ArrayList<>();
    private ArrayList<Float> weightList = new ArrayList<>();
    public Node(String name){
        this.name = name;

    }
    public Node(String name, Node node, float weight){
        this.name = name;
        addConnectedNode(node, weight);

    }

    public void addConnectedNode(Node connected, Float weight){
        connectedList.add(connected);
        weightList.add(weight);
    }
    public String getName(){
        return name;
    }

    public ArrayList<Node> getConnectedList() {
        return connectedList;
    }
    public float getWeight(int i){
        return weightList.get(i);
    }

}
