/**
 * 
 * Generic Linked List Test
 * 
 * @author Burak Sahin
 * 
 */

public class Test{

	public static void main(String[] args){
		// 1st Linked_List Integer
		Linked_List mylinkedlist = new Linked_List(new Integer(5));
		mylinkedlist.setTail(new String("Linked"));
		System.out.println(mylinkedlist.getTail().getHead());
		mylinkedlist = new Linked_List<Integer>(1, 30);
		System.out.println(mylinkedlist.getHeadofTail());
		
		
		// 2nd Linked_List Integer
		Linked_List<Integer> mylinkedlist2 = new Linked_List<Integer>(90, 87);
		System.out.println(mylinkedlist2.getHeadofTail());
		mylinkedlist2.setTail(25);
		System.out.println(mylinkedlist2.getHeadofTail());
		mylinkedlist2.setTail(mylinkedlist);
		System.out.println(mylinkedlist2.getHeadofTail());
	}

}
