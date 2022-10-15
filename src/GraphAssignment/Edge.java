package GraphAssignment;

public class Edge {
	private final Node start, end;
	
	/**
	 *
	 * @param start The starting node
	 * @param end The ending node
	 */
	public Edge(Node start, Node end) {
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
