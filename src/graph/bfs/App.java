package graph.bfs;

public class App {

	public static void main(String[] args) {
		
		BFS b =new BFS();
		Vertex<String> root= new Vertex<>("Adam");
		root.addNeighbour(new Vertex<String>("Bradley"));
		root.addNeighbour(new Vertex<String>("Casey"));
		root.addNeighbour(new Vertex<String>("Daniel"));
		root.getNeighbourList().get(0).addNeighbour(new Vertex<String>("Mahmut"));
		root.getNeighbourList().get(0).addNeighbour(new Vertex<String>("Henry"));
		root.getNeighbourList().get(2).addNeighbour(new Vertex<String>("Rauf"));
		root.getNeighbourList().get(0).getNeighbourList().get(0).addNeighbour(new Vertex<String>("Solomon"));
		root.getNeighbourList().get(0).getNeighbourList().get(0).addNeighbour(new Vertex<String>("Zeynel"));
		b.bfs(root);
	}
}
