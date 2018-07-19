package graph.bfs;

import java.util.ArrayList;
import java.util.List;

public class Vertex<E> {
	
	private E data;	//Generic type of data
	private List<Vertex<?>> neighbourList;
	private boolean visited;
	
	//Constructor
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
	
	public boolean isVisited() {
		return this.visited;
	}
		
	public void setVisited(boolean visited) {
		this.visited = visited;
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
	
	@Override
	public String toString() {
		
		return super.toString();
	}
}
