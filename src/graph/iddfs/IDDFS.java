package graph.iddfs;

import java.util.Stack;

/**
 * Iterative deepening depth first search
 * Inherents advantages of DFS and BFS.
 * Being used for finding target in the graph
 * @author t420
 *
 */
public class IDDFS {

	private Vertex<?> targetVertex;
	private volatile boolean isTargetFound;
	private boolean isEnd=false;
	private int traversedVerteces=0;

	public IDDFS(Vertex<?> v) {
		this.targetVertex=v;
	}

	public void setTargetFound(boolean isTargetFound) {
		this.isTargetFound = isTargetFound;
	}

	public boolean getTargetFound() {
		return isTargetFound;
	}

	public void iddfs(Vertex<?> root){

		//search in graph gradually
		int depth=0;
		//until target is found
		while(!getTargetFound() && !isEnd ){
			System.out.println();
			dfs(root,depth);
			depth++;
		}
	}
	/**
	 * Regular DFS algorithm with runs to given depth
	 * @param source
	 * @param depth
	 */
	public void dfs(Vertex<?> source, int depth){

		int numVertex=0;	//Stop mech. in case of target isn't in graph
		Stack<Vertex<?>> stack= new Stack<>();
		source.setDepthLevel(0);
		stack.push(source);

		while(!stack.isEmpty()){	

			Vertex<?> actual=stack.pop();
			numVertex++;
			System.out.print(actual.getData()+"  ");
			if(actual.getData().equals(this.targetVertex.getData())){
				System.out.println("\nTarget has been found: "+actual.getData());
				this.setTargetFound(true);
				return;
			}
			if(actual.getDepthLevel()>=depth){				
				continue;				
			}			
			for(Vertex<?> v : actual.getNeighbourList()){				
				v.setDepthLevel(actual.getDepthLevel()+1);
				stack.push(v);				
			}
		}//end of while loop
		if(numVertex==this.traversedVerteces)
			isEnd=true;
		else
			this.traversedVerteces=numVertex;
	}// end of dfs()
}
