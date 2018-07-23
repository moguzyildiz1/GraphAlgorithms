package graph.astar;

import java.util.Comparator;

public class NodeComperator implements Comparator<Node>{

	public int compare(Node n1, Node n2){
		if(n1.getFx()>n2.getFx()) return 1;
		if(n1.getFx()<n2.getFx()) return -1;
		return 0;
	}
}
