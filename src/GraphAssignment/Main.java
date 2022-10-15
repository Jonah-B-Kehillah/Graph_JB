package GraphAssignment;

import java.util.HashSet;
import java.util.InvalidPropertiesFormatException;
import java.util.concurrent.ExecutionException;

public class Main {
	
	public static int testNum;
	public static int passed;
	public static int failed;
	
	private static void test(boolean input, String function) {
		testNum++;
		if(input){
			passed++;
			System.out.println(String.format("\033[0;92mTest #%d passed (%s)\033[0m", testNum, function));
		} else{
			failed++;
			System.out.println(String.format("\033[1;31mTest #%d failed (%s)\033[0m", testNum, function));
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Run Graph_JB.jar in terminal that supports ANSI text formatting for optimal experience");
		
		test(testNode1(), "testNode1()");
		test(testNode2(), "testNode2()");
		
		test(testEdge1(), "testEdge1()");
		test(testEdge2(), "testEdge2()");
		test(testEdge3(), "testEdge3()");
		
		test(testGraph1(), "testGraph1()");
		test(testGraph2(), "testGraph2()");
		
		System.out.println(String.format("Tests failed: %d, Tests passed: %d", failed, passed));
		System.out.println(String.format("(Total tests: %d)", testNum));
	}
	
	private static boolean testNode1(){
		Node<Integer> node = new Node<Integer>(12);
		return node.getValue() == 12;
	}private static boolean testNode2(){
		Node<Integer> node = new Node<Integer>(12);
		node.setValue(18);
		return node.getValue() == 18;
	}
	
	private static boolean testEdge1(){
		Edge edge = new Edge(new Node<Integer>(7), new Node<Integer>(86));
		return edge.toString().equals("7 -> 86");
	}private static boolean testEdge2(){
		Node n1 = new Node<Integer>(7);
		Node n2 = new Node<Integer>(86);
		Edge edge = new Edge(n1, n2);
		return edge.getStart() == n1 && edge.getEnd() == n2;
	}private static boolean testEdge3(){
		Node n1 = new Node<Integer>(7);
		Edge edge = new Edge(n1, n1);
		return edge.getStart() == edge.getEnd();
	}
	
	private static boolean testGraph1(){
		Node a = new Node<Integer>(1);
		Node b = new Node<Integer>(2);
		HashSet<Node> n = new HashSet<Node>();
		n.add(a);
		n.add(b);
		HashSet<Edge> e = new HashSet<Edge>();
		e.add(new Edge(a,b));
		e.add(new Edge(b,a));
		Graph g = new Graph(n,e);
		String s = g.toString();
		n.add(new Node<Float>(3.7f));
		return g.toString().equals(s);
	}private static boolean testGraph2(){
		Node a = new Node<Integer>(1);
		Node b = new Node<Integer>(2);
		HashSet<Node> n = new HashSet<Node>();
		n.add(a);
		n.add(b);
		HashSet<Edge> e = new HashSet<Edge>();
		e.add(new Edge(a,b));
		e.add(new Edge(b,a));
		Graph g = new Graph(n,e);
		return g.getNodes().equals(n) && g.getEdges().equals(e);
	}
	
}
