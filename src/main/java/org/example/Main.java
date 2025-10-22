package org.example;

public class Main {
    public static void main(String[] args) {
        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        A.addConnectedNode(B, 1.5F);
        B.addConnectedNode(C, 3.7F);
        C.addConnectedNode(A, 1.2F);
        C.addConnectedNode(B,7.8F);
        AdjacencyMatrix matrix = new AdjacencyMatrix();
        matrix.addNode(A);
        matrix.addNode(B);
        matrix.addNode(C);
        matrix.displayMatrix();
    }
}