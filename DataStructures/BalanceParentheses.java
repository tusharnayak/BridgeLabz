package com.Bridgelabz.DataStructure;

public class BalanceParentheses {
	static StackNew<String> st = new StackNew<String>();

	public static void main(String[] args) {
		String str = "(5+6)*(7+8)/(4+3)*(5+6)*(7+8)/(4+3)";
		DS_utility.paraMatching(st, str);
		if (st.isEmpty()) {
			System.out.println("balanced");
		} else {
			System.out.println("not balanced");
		}
	}
}
