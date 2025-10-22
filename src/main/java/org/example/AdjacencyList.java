package org.example;

import java.util.ArrayList;
import java.util.Objects;

public class AdjacencyList {
    private ArrayList<Node> nodes = new ArrayList<>();
    private ArrayList<String> names = new ArrayList<>();
    public void addNode(Node node){
        nodes.add(node);
        names.add(node.getName());
    }
    public ArrayList<String> getNames(){
        return names;
    }
    public ArrayList<Node> getNodes(){
        return nodes;
    }
    public Node returnNode(String name){
        int j = 0;

        for(int i = 0; i<nodes.size(); i++){
            if(Objects.equals(name, nodes.get(i).getName())){
                j = i;
            }


        }
        return nodes.get(j);
    }
    public void displayList(){
        for(int i = 0; i < nodes.size(); i++){
            System.out.print(nodes.get(i).getName() + ": ");
            for(int j = 0; j < nodes.get(i).getConnectedList().size(); j++){
                System.out.print(nodes.get(i).getConnectedList().get(j).getName() + "(" + nodes.get(i).getWeight(j) + ") ");
            }
            System.out.println();
        }
    }

}