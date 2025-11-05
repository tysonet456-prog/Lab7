package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class BFS {


    public ArrayList<String> connectedList(ArrayList<Node> graph) {
        for(int j=0; j<graph.size(); j++){
            graph.get(j).setVisited(false);
        }
        ArrayList<String> connectedNodes = new ArrayList<>();
        LinkedList<Node> nodeQueue = new LinkedList<>();
        Node source = graph.getFirst();
        connectedNodes.add(source.getName());
        nodeQueue.add(source);
        while(!nodeQueue.isEmpty()){
            Node curr = nodeQueue.poll();
            if(!curr.isVisited()){
            connectedNodes.add(curr.getName());
            nodeQueue.addAll(curr.getConnectedList());
        }
        curr.setVisited(true);
        }
        return connectedNodes;
    }}