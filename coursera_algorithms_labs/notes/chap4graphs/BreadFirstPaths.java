package chap4graphs;

//import java.util.Queue;
import edu.princeton.cs.algs4.Queue;

public class BreadFirstPaths {
    private boolean [] marked;
    private int[] edgeTo;

    private void bfs(Graph G, int s){
        Queue<Integer> q = new Queue<Integer>();
        q.enqueue(s);
        marked[s] = true;
        while(!q.isEmpty()){
            int v =q.dequeue();
            for (int w: G.adj(v)){
                if(!marked[w]){
                    q.enqueue(w);
                    marked[w]=true;
                    edgeTo[w] =v;
                }
            }
        }
    }
}
