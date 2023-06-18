package Graphs;
import java.util.*;
class Graph{
    int vertices;
    List<List<Integer>> adj;
    Graph(int ver){
        vertices=ver;
        adj = new ArrayList<>(vertices);
        for(int i=0;i<vertices;i++){
            adj.add(new ArrayList<>());
        }
    }
    public void addEdge(int source, int destin){
        adj.get(source).add(destin);
    }
    public List<Integer> bfs(int start){
        List<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<Integer>();
        visited[start]=true;
        queue.add(start);
        while(!queue.isEmpty()){
            int cur=queue.poll();
            res.add(cur);
            List<Integer> hh = adj.get(cur);
            for(int a:hh){
                if(!visited[a]){
                    visited[a]=true;
                    queue.add(a);
                }
            }
        }
        return res;
    }
}

public class graph_bfs{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int ver = in.nextInt();
        int edges=in.nextInt();
        Graph graph = new Graph(ver);
        for(int i=0;i<edges;i++){
            int source = in.nextInt();
            int destin=in.nextInt();
            graph.addEdge(source,destin);
        }
        int start = in.nextInt();
        List<Integer> res = graph.bfs(start);
        System.out.println(res);
    }
}
