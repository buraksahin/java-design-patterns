/**
 * 
 * 	Generic Linked List
 * 
 * 	@author Burak Sahin
 * 
 */

class Linked_List<T>{
	
	// Variables
	private T head;
	private Linked_List<T> tail;
	
	// Initialization
	{
		head = null;
		tail = null;
	}
	
	// Constructor
	Linked_List(){}
	
	Linked_List(T _head){
		head = _head;
	}
	
	Linked_List(T _head, T _tail){
		head = _head;
		tail = new Linked_List<T>(_tail);
	}
	
	Linked_List(T _head, Linked_List<T> _tail){
		head = _head;
		tail = _tail;
	}
	
	// Getters and Setters
	public T getHead(){
		return head;
	}
	
	public void setHead(T _head) {
		head = _head;
	}
	
	public Linked_List<T> getTail(){
		return tail;
	}
	
	public void setTail(T _second) {
		tail = new Linked_List<T>(_second);
	}
	
	public void setTail(Linked_List<T> _second) {
		tail = _second;
	}
	
	public T getHeadofTail(){
		if(tail != null){
			return tail.head;			
		}
		else{return null;}
	}
	
	public void removeTail(){
		tail = null;
	}
	
	public void removeHead(){
		head = null;
	}

}
