/**
 Assignment - Algorithms:Theory, Design and Implementation
 Sachintha Amarasiri -w1714878
 */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.LinkedList;
public class MaxFlow {

        // Number of vertices in graph
        private static int NumVertice;

        // Returns true if there is a path from source(s) to sink(t) in residual graph
        public boolean breadthFirstSearch(int residualGraph[][], int s, int t, int parent[])
        {
            // Create a visited array and mark all vertices as not visited
            boolean visited[] = new boolean[NumVertice];
            for(int i=0; i<NumVertice; ++i)
                visited[i]=false;

            // Create a queue, enqueue source vertex and mark source vertex as visited
            LinkedList<Integer> queue = new LinkedList<Integer>();
            queue.add(s);
            visited[s] = true;
            parent[s]=-1;

            // Standard breadthFirstSearch Loop
            while (queue.size()!=0)
            {
                int u = queue.poll();

                for (int v=0; v<NumVertice; v++)
                {
                    if (visited[v]==false && residualGraph[u][v] > 0)
                    {
                        queue.add(v);
                        parent[v] = u;
                        visited[v] = true;
                    }
                }
            }

            // If we reached sink in breadthFirstSearch starting from source, then return true
            return (visited[t] == true);
        }

        // Returns tne maximum flow from source(s) to sink(t) in the given graph
        public int fordFulkerson(int graph[][], int s, int t)
        {
            int u, v;

            int residualGraph[][] = new int[NumVertice][NumVertice];

            for (u = 0; u < NumVertice; u++)
                for (v = 0; v < NumVertice; v++)
                    residualGraph[u][v] = graph[u][v];

            // This array is filled by breadthFirstSearch and to store path
            int parent[] = new int[NumVertice];

            int max_flow = 0; // There is no flow initially

            // Augment the flow while there is path from source to sink
            while (breadthFirstSearch(residualGraph, s, t, parent))
            {

                // Find the maximum flow through the path found
                int path_flow = Integer.MAX_VALUE;
                for (v=t; v!=s; v=parent[v])
                {
                    u = parent[v];
                    path_flow = Math.min(path_flow, residualGraph[u][v]);
                }


                for (v=t; v != s; v=parent[v])
                {
                    u = parent[v];
                    residualGraph[u][v] -= path_flow;
                    residualGraph[v][u] += path_flow;
                }

                // Add path flow to max flow
                max_flow += path_flow;
            }

            // Return the max flow
            return max_flow;
        }

        // Get user input values
        public void getValue(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Number of nodes in graph (6 or more than 6): ");
            int V = scan.nextInt();

            if(V>= 6) {
                // User input number of nodes equal to number of vertices
                NumVertice = V;
                // Creating new 2D array , graph is represent as a 2D matrix
                int graph[][] = new int[V][V];

                // Read number for each cell
                int count = 1;  // Set count to 1
                for (int i = 0; i < V; i++) {
                    System.out.print("Enter node " + (count++) + " each edge capacities - ");
                    for (int j = 0; j < V; j++) {
                        graph[i][j] = scan.nextInt();
                    }
                }
                MaxFlow m = new MaxFlow();

                System.out.println("The maximum flow is " + m.fordFulkerson(graph, 0, V - 1));
            }
            else{
                System.out.println("Invalid input, enter 6 or more than 6 \ntry again...");

                getValue();
            }
        }

        public static void main (String[] args) throws Exception
        {
            MaxFlow obj = new MaxFlow();
            obj.getValue();

        }


}
