package org.example;

import java.util.ArrayList;

public class BFS {
    ArrayList<String> connectedNodes = new ArrayList<>();
    public ArrayList<String> connectedList(Node node) {

        if (!connectedNodes.contains(node)){
            connectedNodes.add(node.getName());
            for(int i=0; i<node.getConnectedList().size(); i++){
                if(!connectedNodes.contains(node.getConnectedList().get(i).getName())){

                }
            }

        }
    }
}