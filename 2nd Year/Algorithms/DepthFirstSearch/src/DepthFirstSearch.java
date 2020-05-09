import java.io.*;
import java.util.*;

public class DepthFirstSearch {

    // number of vertices
    private int V;

    // array of lists for adjacency list representation
    private LinkedList<Integer> adjacency[];

    // constructor
    DepthFirstSearch(int v)
    {
        V = v;
        adjacency = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adjacency[i] = new LinkedList();
    }

    // add an edge into the graph
    public void addEdge(int v, int w)
    {
        adjacency[v].add(w); // Add w to v's list
    }

    // used by DFS
    public void DFSUtil(int v,boolean visited[])
    {
        // mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v+" ");

        // recur for all the vertices adjacent to this vertex
        Iterator<Integer> i = adjacency[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }


    // depth first search traversal
    public void DFS(int v)
    {
        // mark all the vertices as not visited
        boolean visited[] = new boolean[V];

        // call the DFSUtil method
        DFSUtil(v, visited);
    }

    public static void main(String args[]) {
        DepthFirstSearch g = new DepthFirstSearch(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Search "+
                "(starting from vertex 1) : ");

        g.DFS(1);
    }

}
