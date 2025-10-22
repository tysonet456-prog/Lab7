package org.example;

import java.util.ArrayList;

public class AdjacencyMatrix {
    private ArrayList<Node> nodes = new ArrayList<>();
    public void addNode(Node node){
        nodes.add(node);
    }
    public void displayMatrix(){
        System.out.print("  ");
        for(int i = 0; i < nodes.size(); i++){
           System.out.print(nodes.get(i).getName() + " ");
        }
        System.out.println();
        for(int j = 0; j < nodes.size(); j++){
            System.out.print(nodes.get(j).getName() + " ");
            for(int k = 0; k < nodes.size(); k++){
                if(nodes.get(j).getConnectedList().contains(nodes.get(k))){
                    System.out.print("1 ");

                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
