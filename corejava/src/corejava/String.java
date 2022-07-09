package corejava;

import java.util.Scanner;

public class String {

	public static void main(java.lang.String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			java.lang.String A= sc.next();
			  java.lang.String B= sc.next();
  
			System.out.println(A.length()+B.length());
			if(A.compareTo(B)>0){
			System.out.println("Yes");
			}
			else{
				System.out.println("no");
			System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+Character.toUpperCase(B.charAt(0))+B.substring(1));
			}
		}
	}

}
