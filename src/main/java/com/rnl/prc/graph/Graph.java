package com.rnl.prc.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {

    private  int V; // number of nodes
    private LinkedList<Integer> adj[];



    public Graph(int size){
        V   = size;
        adj = new LinkedList[V];
        for (int i =0 ; i < size ; i++)
            adj[i] = new LinkedList<Integer>();


    }

    public void addEdge(int v, int w){
        adj[v].add(w);
    }

    public static void main(String[] args){
        Graph g = new Graph(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);

        g.justPrintGraph();

        g.DFS();
        System.out.println();
        g.DFSBystack();

    }

    public void justPrintGraph(){

        for (int i =0 ; i < V; i++){

            Iterator<Integer> itr = adj[i].iterator();

            boolean print =false;
            while(itr.hasNext()){
                if(!print){
                    System.out.print(i+" -----> ");
                    print = true;
                }
                System.out.print(itr.next()+" ");
            }
            System.out.println();

        }
    }

    public  void DFS(){
        boolean[] V1 = new boolean[V];
        for(int i=0; i < V; i++) V1[i] = false;
        DFS(0, V1);

    }
    public  void DFS(int n, boolean[] v1){

        System.out.print(n+" ");
        v1[n] = true;

        Iterator<Integer> itr = adj[n].iterator();

        while(itr.hasNext()){
            int x = itr.next();
            if(!v1[x]){
                DFS(x,v1);
            }

        }

    }
    public void DFSBystack(){

        boolean[] visited = new boolean[V];
        for (int  i =0 ; i < V; i++)
            visited[i] = false;

        int startNode = 0;

        Stack<Integer> s = new Stack<>();
        s.push(0);

        while(!s.isEmpty()){

            int i = s.pop();
            visited[i] = true;

            System.out.print(i+" ");

            Iterator<Integer> itr = adj[i].iterator();

            while(itr.hasNext()){
                int c = itr.next();
                if (!visited[c]){
                    visited[c] = true;
                    s.push(c);
                }

            }
        }
    }
}
