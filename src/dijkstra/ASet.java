package dijkstra;

import java.util.HashSet;


public class ASet implements ASetInterface{

	private final HashSet<VertexInterface> aSet;
	
	
	public ASet() {
		aSet = new HashSet<VertexInterface>();
	}
	
	
	@Override
	public void add(VertexInterface vertex) {
		aSet.add(vertex);		
	}
	
	@Override
	public boolean contains(VertexInterface vertex) {
		return aSet.contains(vertex);
	}



	
}
