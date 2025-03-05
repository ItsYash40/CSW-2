import java.util.*;
public class Ass2P2_Q6 {
	 public static void main(String[] args) {
	 TreeSet<Integer> treeSet = new TreeSet<>();
	 Scanner sc = new Scanner(System.in);
	 treeSet.add(10);
	 treeSet.add(20);
	 treeSet.add(30);
	 treeSet.add(40);
	 treeSet.add(50);
	 System.out.println("Elements of the TreeSet:");
	 for (Integer element : treeSet) {
	 System.out.print(element + " ");
	 }
	 System.out.print("\n\nEnter a number to check: ");
	 int numberToCheck = sc.nextInt();
	 if (treeSet.contains(numberToCheck)) {
	 System.out.println("Number " + numberToCheck + " exists in theTreeSet.");
	 } else {
	 System.out.println("Number " + numberToCheck + " does not exist inthe TreeSet.");
	 }
	 System.out.print("\nEnter a number to remove: ");
	 int numberToRemove = sc.nextInt();
	 if (treeSet.remove(numberToRemove)) {
	 System.out.println("Number " + numberToRemove + " removed from theTreeSet.");
	 } else {
	 System.out.println("Number " + numberToRemove + " does not exist inthe TreeSet.");
	 }
	 System.out.println("\nUpdated elements of the TreeSet:");
	 for (Integer element : treeSet) {
	 System.out.print(element + " ");
	 }
	 sc.close();
	 }
	}
/*6. Write a program to create a TreeSet of Integer type and perform the following
operations:
(a) Display the elements of the TreeSet.
(b) Prompt the user to enter a number and check whether the number is present in the
TreeSet.
(c) Remove a specified element from the TreeSet. 
*/