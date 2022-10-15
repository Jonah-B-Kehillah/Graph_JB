package GraphAssignment;

public class Node<T> {
	private T value;
	public Node(T value) {this.value=value;}
	
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	
	public String toString() {
		return ((T) value).toString(); // Casts `value` to non-primitive data type so Integer.toString() can be used
	}
	
}
