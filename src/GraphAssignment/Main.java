package GraphAssignment;

import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		
		Node myFirstNode = new Node(123);
		Node mySecondNode= new Node(234);
		Edge myFirstEdge = new Edge(myFirstNode, mySecondNode);
		
		// A graph is a set of Nodes and Edges
		HashSet<Node> myNodes = new HashSet<Node>();
		HashSet<Edge> myEdges = new HashSet<Edge>();
		myNodes.add(myFirstNode);
		myNodes.add(mySecondNode);
		myEdges.add(myFirstEdge);
		
		Graph myFirstGraph = new Graph(myNodes, myEdges);
		System.out.println(myFirstGraph);
		
	}
}
