package graph.iddfs;

import java.util.ArrayList;
import java.util.List;

public class Vertex<E>{

	private E data;	//Generic type of data
	private List<Vertex<?>> neighbourList;
	private int depthLevel=0;

	public Vertex(E data) {
		this.data=data;
		neighbourList=new ArrayList<>();
	}

	public void setData(E data) {
		this.data = data;
	}

	public E getData() {
		return data;
	}

	public int getDepthLevel() {
		return depthLevel;
	}

	public void setDepthLevel(int depthLevel) {
		this.depthLevel = depthLevel;
	}

	public void setNeighbourList( List<Vertex<?>>neighbourList) {
		this.neighbourList = neighbourList;
	}

	public List<Vertex<?>> getNeighbourList() {
		return neighbourList;
	}

	public boolean addNeighbour(Vertex<?> vertex){
		return (neighbourList.add(vertex));
	}	
}