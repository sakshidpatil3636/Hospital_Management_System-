package Ambulance;

import java.util.Stack;

public class ambulance {
	Stack<Integer> stk =new Stack<Integer>() ;
	public void insert_ambulance() {
	  for(int i=5634;i<5644;i++) {
		stk.push(i);
	  }
	}
	public int book_ambulance() {
		if(stk.isEmpty()) {
			System.out.println("No ambulance is available now.");
			System.out.println("We will inform you as soon as it is available.");
		}
		return stk.pop();
	}
}
