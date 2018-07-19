package graph.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	public void bfs(Vertex<?> root){

		//Actually linkedList implements queue interface
		//We can instantiate a queue as a linkedList
		Queue<Vertex<?>> queue= new LinkedList<>();
		root.setVisited(true);	//First node to be visited
		System.out.println("Vertex "+root.getData()+" visited.");
		queue.add(root);

		while(!queue.isEmpty()){ //perform until queue will be empty
			Vertex<?> actual= queue.poll();
			for(int i=0;i<actual.getNeighbourList().size();i++){
				Vertex<?> v=actual.getNeighbourList().get(i);
				if(!v.isVisited()){
					v.setVisited(true);
					System.out.println("Vertex "+v.getData()+" visited.");
					queue.add(v);
				}
			}
		}

	}
}
