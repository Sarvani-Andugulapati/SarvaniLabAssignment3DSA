package com.Question1.Driver;
import java.util.Scanner;
import com.Question1.Service.*;
public class BalanceStringmain {
static String str;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BracketsStack bs = new BracketsStack();
		System.out.println("Enter the string to check for Redundancy\n");
		str = sc.nextLine();
		System.out.println("The String entered is:"+" "+str);
		boolean status;
		status = bs.Bracketbalancecheck(str);
		if(status) {
			System.out.println("The String of brackets is balanced");
		}else {
			System.out.println("The String of brackets is unbalanced");
		}
		sc.close();
	}
}
