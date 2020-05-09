/**
 * Assignment - Algorithms:Theory, Design and Implementation
 * Name : P.K.Sachintha Sandeepani Amarasiri
 * UOW id : w1714878
 * IIT id : 2018051
 **/

import java.util.*;
import java.lang.*;
import java.util.LinkedList;

public class MaxFlow {

        // number of vertices in graph
        private static int numVertices;

        // returns the maximum flow from source to sink in the given graph
        public int fordFulkerson(int graph[][], int source, int sink) {

            // residual graph
            int residualGraph[][] = new int[numVertices][numVertices];

            // initialize residual graph
            int u, v;
            for (u = 0; u < numVertices; u++) {
                for (v = 0; v < numVertices; v++) {
                    residualGraph[u][v] = graph[u][v];
                }
            }

            // parent array is filled by breadthFirstSearch and to store path
            int parent[] = new int[numVertices];

            // initialize max flow as 0
            int max_flow = 0;

            System.out.println("\nAugmenting Paths : ");
            // augment the flow while there is path from source to sink
            while (breadthFirstSearch(residualGraph, source, sink, parent)) {

                // find the maximum flow through the path found
                int path_flow = Integer.MAX_VALUE;
                int s , t;
                ArrayList<Integer> array = new ArrayList<Integer>();
                for (t = sink; t != source; t = parent[t]) {
                    s = parent[t];

                    // find flow possible in path, get minimum capacity among all edges (bottle neck capacity)
                    path_flow = Math.min(path_flow, residualGraph[s][t]);
                    array.add(t);
                }
                array.add(0);
                Collections.reverse(array);
                // print augmenting path
                array.forEach(val-> System.out.print(val + " -> "));

                // update the residual graph
                for (t = sink; t != source; t = parent[t]) {

                    s = parent[t];
                    // reduce the capacity on forward edge by path flow
                    residualGraph[s][t] -= path_flow;
                    // increase the capacity on backward edge by path flow
                    residualGraph[t][s] += path_flow;

                }

                System.out.println("  flow value : "+ path_flow);

                // add path flow to max flow
                max_flow += path_flow;
            }

            // return the max flow
            return max_flow;
        }

        // returns true if there is a path from source(s) to sink(t) in residual graph
        public boolean breadthFirstSearch(int residualGraph[][], int s, int t, int parent[]) {

            // create a visited array and mark all vertices as not visited
            boolean visited[] = new boolean[numVertices];
            for(int i=0; i<numVertices; ++i)
                visited[i]=false;

            // create a queue, inset the source vertex and mark source vertex as visited
            LinkedList<Integer> queue = new LinkedList<Integer>();
            queue.add(s);
            visited[s] = true;
            parent[s]=-1;

            // breadthFirstSearch Loop
            while (queue.size()!=0) {
                int u = queue.poll();

                // Visit all the adjacent vertices
                for (int v=0; v<numVertices; v++) {

                    // If vertex is not visited and edges capacity > 0
                    if (!visited[v] && residualGraph[u][v] > 0) {
                        queue.add(v);
                        parent[v] = u;
                        visited[v] = true;
                    }
                }
            }

            // if we reached sink in breadthFirstSearch starting from source, then return true
            return (visited[t]);
        }

        // get user input values
        public void getValue(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Number of nodes in graph (6 or more than 6): ");
            int vertices = scan.nextInt();

            if(vertices>= 6) {
                // user input number of nodes equal to number of vertices
                numVertices = vertices;
                // creating new 2d array , graph is represent as a 2d matrix
                int graph[][] = new int[vertices][vertices];

                // read number for each cell
                int count = 0;  // Set count to 1
                for (int i = 0; i < vertices; i++) {
                    System.out.print("Enter node " + (count++) + " each edge capacities - ");
                    for (int j = 0; j < vertices; j++) {
                        graph[i][j] = scan.nextInt();
                    }
                }

                MaxFlow m = new MaxFlow();

                // watch start
                Stopwatch watch = new Stopwatch();

                System.out.println("\nThe maximum flow from source 0 to sink " +(vertices-1)+" is : "+ m.fordFulkerson(graph, 0, vertices - 1));
                // watch stop
                StdOut.println("Elapsed time :" + watch.elapsedTime());

                System.out.println();
                System.out.println("Enter : \n 1) delete edge \n 2) update edge \n 3) exit");
                int input = scan.nextInt();

                switch (input){
                    case 1:
                        deleteEdge(graph , vertices);
                        break;

                    case 2:
                        updateEdge(graph , vertices);
                        break;

                    case 3:
                        System.out.println("Bye....Bye....");
                        break;

                    default:
                        System.out.println("Please enter valid number.... \nTry again later....");
                }
            }
            else{
                System.out.println("Invalid input, enter 6 or more than 6 \nTry again...\n");

                getValue();
            }
        }

        // delete edge
        public static void deleteEdge(int[][] graph , int vertices){
            Scanner sc = new Scanner(System.in);

            // get user inputs
            System.out.print("Enter start node of edge which you want to delete : ");
            int startnode= sc.nextInt();
            System.out.print("Enter end node of edge which you want to delete : ");
            int endnode= sc.nextInt();

            // delete edge and update graph
            graph[startnode][endnode] = 0;
            MaxFlow max = new MaxFlow();

            System.out.println("\nThe new maximum flow from source 0 to sink " +(vertices-1)+" is : "+ max.fordFulkerson(graph, 0, vertices - 1));

        }

        // update edge
        public static void updateEdge(int[][] graph , int vertices){

            Scanner sc = new Scanner(System.in);
            // get user input
            System.out.print("Enter start node of edge which you want to update : ");
            int startN= sc.nextInt();
            System.out.print("Enter end node of edge which you want to update : ");
            int endN= sc.nextInt();

            System.out.print("Enter new capacity between " + startN + " to " + endN + " : ");
            int capacity = sc.nextInt();

            // update graph with new capacity
            graph[startN][endN] = capacity;

            MaxFlow max = new MaxFlow();

            System.out.println("\nThe new maximum flow from source 0 to sink " +(vertices-1)+" is : "+ max.fordFulkerson(graph, 0, vertices - 1));

        }


        public static void main (String[] args) {
            System.out.println("**************************************\nMax Flow Algorithm\n**************************************\n");
            MaxFlow obj = new MaxFlow();
            obj.getValue();
        }

}