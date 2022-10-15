package GraphAssignment;

public class Edge {
	private final Node start, end;
	
	/**
	 *
	 * @param start The starting node
	 * @param end The ending node
	 * @throws IllegalArgumentException if the {@code start} and {@code end} nodes are equal.
	 */
	public Edge(Node start, Node end) throws IllegalArgumentException {
		if(start == end) throw new IllegalArgumentException("An edge must connect two separate Nodes");
		this.start = start;
		this.end = end;
	}
	
	public Node getStart() {
		return start;
	}
	public Node getEnd() {
		return end;
	}
	
	public String toString() {
		return start + " -> " + end;
	}
	
}
