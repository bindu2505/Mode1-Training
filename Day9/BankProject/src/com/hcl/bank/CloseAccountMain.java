package com.hcl.bank;

import java.util.Scanner;

public class CloseAccountMain {
	public static void main(String[] args) {
		int accountNo;
		System.out.println("enter account no");
		Scanner sc = new Scanner(System.in);
		accountNo = sc.nextInt();
		System.out.println(AccountBAL.closeAccountBal(accountNo));
	}

}
