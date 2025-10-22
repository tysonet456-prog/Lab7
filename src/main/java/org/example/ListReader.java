package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ListReader {
    private AdjacencyList list;
    public void ListReader(String filePath){
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(" ");
                String floatString = tokens[2] + "f";
                float weight = Float.parseFloat(floatString);
                if(list.getNames().contains(tokens[0])){
                    for(int i=0; i<list.getNames().size(); i++){
                        if(list.getNodes().get(i).getName() == tokens[0]){



                            list.getNodes().get(i).addConnectedNode(new Node(tokens[1]), weight);

                        }
                    }

                }
                else{
                    if(list.getNames().contains(tokens[1])){
                        list.addNode(new Node(tokens[0], list.returnNode(tokens[1]), weight));
                    }
                    else{
                        list.addNode(new Node())
                    }

                }

            }
        }
    }
}
