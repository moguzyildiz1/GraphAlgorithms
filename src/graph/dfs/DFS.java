package graph.dfs;

import java.util.List;
import java.util.Stack;

import graph.bfs.Vertex;

public class DFS {

	/**
	 * Recursive approach of depth first search
	 * This function doesn't work for different clusters.
	 * i.e.: a->b->c  d->e->f there are 2 different clusters
	 * @param root
	 */
	public void dfsRec(Vertex<?> root){

		root.setVisited(true);//Set base condition to end recursion
		System.out.println("Vertex "+root.getData()+" visited.");

		for(Vertex<?> v : root.getNeighbourList())
			if(!v.isVisited())
				dfsRec(v);
	}
	/**
	 * Iterative approach of depth first search 
	 * @param root
	 */
	public void dfsIter(Vertex<?> root){

		//LIFO structure ensure to reach to each leaf first
		Stack<Vertex<?>> stack=new Stack<>();
		root.setVisited(true);
		System.out.println("Vertex "+root.getData()+" visited.");
		stack.add(root);

		while(!stack.isEmpty()){
			Vertex<?> actual=stack.pop();
			for(Vertex<?> v : actual.getNeighbourList()){
				if(!v.isVisited()){
					v.setVisited(true);
					System.out.println("Vertex "+v.getData()+" visited.");
					stack.push(v);
				}
			}
		}
	}// end of dfsIter()
	
	/**
	 * If graph consists of independent clusters
	 * i.e.: a->b->c  d->e->f there are 2 different clusters
	 * @param vertexList
	 */
	public void dfsClusters(List<Vertex<?>> rootList){

		for( Vertex<?> r : rootList){
			if(!r.isVisited()){
				dfsIter(r);
			}
		}
	}// end of dfsClusters()
}
