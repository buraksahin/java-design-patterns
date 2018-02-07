/**
 * Shallow Copy Prototype Test
 */
public class Test{
	public static void main(String[] args){
		// Create Person
		Person person1 = new Person("Burak", "Mercedes");
		System.out.println("Person1: " + person1.getName() + " has " + person1.getCar().getName());

		// Clone Person1
		Person clone1ofp1 = (Person) person1.clone();
		System.out.println("Clone of person1: " + clone1ofp1.getName() + " has " + clone1ofp1.getCar().getName());

		//change the primitive member
		clone1ofp1.setName("Burak(Clone)");

		//change the lower-level object 
		clone1ofp1.getCar().setName("Ferrari"); 

		System.out.println("Clone of person1: " + clone1ofp1.getName() + " has " + clone1ofp1.getCar().getName() + " Car @" + clone1ofp1.getCar().hashCode());
		System.out.println("Original (after clone is modified): " + person1.getName() + " has " + person1.getCar().getName() + " Car @" + person1.getCar().hashCode());
	}
}
