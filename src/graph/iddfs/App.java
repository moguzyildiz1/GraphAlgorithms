package graph.iddfs;

public class App {

	public static void main(String[] args) {

		Vertex<String> target= new Vertex<>("Zeyne");
		IDDFS d =new IDDFS(target);	

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
		System.out.println("Result of iddfs:");
		d.iddfs(root);
	}

}
