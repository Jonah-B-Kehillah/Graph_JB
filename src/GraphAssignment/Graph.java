package GraphAssignment;

import java.util.HashSet;


public class Graph {
	
	private HashSet<Node> nodes;
	private HashSet<Edge> edges;
	
	/**
	 *
	 * @param nodes A set containing the nodes to be included in the graph
	 * @param edges A set containing the edges to be included in the graph
	 * @implNote The parameters {@code nodes} and {@code edges} are not passed as pointers
	 */
	public Graph(HashSet<Node> nodes, HashSet<Edge> edges) {
		
		// We don't want to assign a pointer to the variables, we want to assign a set of values
		this.nodes = new HashSet<Node>();
		for(Node n : nodes) this.nodes.add(n);
		this.edges = new HashSet<Edge>();
		for(Edge e : edges) this.edges.add(e);
		
	}
	
	public String toString() {
		String out = "";
		out += nodes.toString().replace("[", "").replace("]", "");
		out += "\n";
		out += edges.toString().replace("[", "").replace("]", "");
		return out;
	}
	
}
