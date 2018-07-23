package graph.astar;
/**
 * Essential of AStar algorithm is f(x) value which consists of g(x) and h(x)
 * g(x) is cost of current from starting point. h(x) is cost of distance to
 * end point. Every node has to store these two values.
 * @author t420
 *
 */
public class Node {
	
	private int g;	// cost from starting point
	private int h;	//Approximately (heuristic) cost to destination
	private int row;	//row coordinate
	private int col;	//column coordinate
	
	private Node predecessor;	//previous node
	private boolean isBlock;	//is block or part of path
	
	public Node(int row,int col) {
		this.col=col;
		this.row=row;		
	}
	
	public int getFx(){
		return getG()+getH();
	}
	
	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}
	
	@Override
	public boolean equals(Object obj) {
		Node n=(Node)obj;
		return (n.getCol()==this.getCol()&&n.getRow()==this.getRow());
	}
	
	@Override
	public String toString() {
		return "Node ("+getRow()+","+getCol()+") : g(x)="+getG()+" - "+"h(x)="+getH()+" - "+"f(x)="+getFx();
	}
	
	public Node getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(Node predecessor) {
		this.predecessor = predecessor;
	}

	public boolean isBlock() {
		return isBlock;
	}
	
	public void setBlock(boolean b){
		this.isBlock=b;
	}
}
