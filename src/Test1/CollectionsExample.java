package Test1;

import java.util.*;
//import java.util.Collections;

public class CollectionsExample {

	public static void main(String[] args) {
		
		
		/*ArrayList<String> myList =new ArrayList<String>();
		
		myList.add("Sai");
		myList.add("Sri");
		myList.add("Smu");
		myList.add("Sku");
		
		System.out.println(myList);
		
		//Collections.sort(myList);
		
		//Descending Order
		System.out.println("After reverse sorting");
		Collections.sort(myList,Collections.reverseOrder());
		System.out.println(myList);

		//Ascending Order
		System.out.println("After Forward sorting");
		Collections.sort(myList);
		System.out.println(myList); */
		
		
		//Stack(LIFO)
		Stack<String> myStack = new Stack<String>();
		
		myStack.push("amd");
		myStack.push("sms");
		myStack.push("yzd");
		//myStack.pop();   //to remove the last item
		myStack.push("res");
		
		System.out.println(myStack);		
 		
	}

}
