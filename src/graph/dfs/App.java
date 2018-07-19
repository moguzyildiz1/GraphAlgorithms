package graph.dfs;

import graph.bfs.Vertex;

public class App {

	public static void main(String[] args) {
		
		DFS d =new DFS();	
		Vertex<String> root= new Vertex<>("Adam");
		root.addNeighbour(new Vertex<String>("Bradley"));
		root.addNeighbour(new Vertex<String>("Casey"));
		root.addNeighbour(new Vertex<String>("Daniel"));
		root.getNeighbourList().get(0).addNeighbour(new Vertex<String>("Mahmut"));
		root.getNeighbourList().get(0).addNeighbour(new Vertex<String>("Henry"));
		root.getNeighbourList().get(2).addNeighbour(new Vertex<String>("Rauf"));
		root.getNeighbourList().get(0).getNeighbourList().get(0).addNeighbour(new Vertex<String>("Solomon"));
		root.getNeighbourList().get(0).getNeighbourList().get(0).addNeighbour(new Vertex<String>("Zeynel"));	
		/*System.out.println("Result of dfsRec:");
		d.dfsRec(root);*/
		System.out.println("Result of dfsIter:");
		d.dfsIter(root);
	}
}
