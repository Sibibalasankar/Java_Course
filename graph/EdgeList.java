package graph;

import java.util.*;

public class EdgeList {
    int n ;
    ArrayList<Edges> edges;
    EdgeList(int n){
        this.n = n ;
        edges=new ArrayList<>();
    }

    public void add(int u,int v){
        edges.add(new Edges(u, v));
    }

    public void print(){
        for (Edges edge: edges){
            System.out.println(edge.u + " -> " + edge.v);
        }
    }
    
    public ArrayList<Integer> getNeighbours(int node){

    ArrayList<Integer> neighbours =
            new ArrayList<>();

    for(Edges edge : edges){

        if(edge.u == node){
            neighbours.add(edge.v);
        }

        if(edge.v == node){
            neighbours.add(edge.u);
        }
    }

    return neighbours;
}
}
