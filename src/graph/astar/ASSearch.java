package graph.astar;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class ASSearch {

	//Search space area
	private Node[][] table;
	private Node startPoint;
	private Node finalPoint;
	private List<Node> closedSet;	//already evaluated nodes
	private Queue<Node> openSet;
	
	public ASSearch() {

		this.table=new Node[Constants.NUM_ROW][Constants.NUM_COL];
		this.openSet= new PriorityQueue<>(new NodeComperator());	//every time we get lowest f(x) Node
		this.closedSet= new ArrayList<>();
		initializeTable();
	}
	
	/**
	 * Initialize new nodes to all table
	 */
	public void initializeTable(){
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[0].length; j++) {
				Node n =new Node(i,j);
				table[i][j]=n;
			}
		}
	}// end of initializeTable()
	/**
	 * Set obstacles positions on the table
	 */
	public void setObstacles(int obs[][]){
		for (int a[] : obs) {
			(table[a[0]][a[1]]).setBlock(true);
		}
	}
	
	public void setStartFinal(Node nS,Node nF){
		this.startPoint=nS;
		this.finalPoint=nF;
	}
	
	public void search(){
		
	}
}
