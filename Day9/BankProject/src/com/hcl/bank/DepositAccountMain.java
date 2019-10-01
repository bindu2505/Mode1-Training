package com.hcl.bank;

import java.util.Scanner;

public class DepositAccountMain {
	public static void main(String[] args) {
		int accountno,depAmount;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter account no");
		accountno= sc.nextInt();
		System.out.println("enter deposit amount");
		depAmount = sc.nextInt();
		System.out.println(AccountBAL.depositAccountBal(accountno, depAmount));
	}

}
