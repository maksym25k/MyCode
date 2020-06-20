package cz.spsejecna.novak.c2a.factory;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean option = true;
		try {
			System.out.println("1 ... EquilateralTriangle");
			System.out.println("2 ... IsoscelesTriangle");
			int x = sc.nextInt();
			if(x == 1) {
				option = false;
			}
			else if(x == 2) {
				option = true;
			}else {
				throw new Exception("1 or 2"); 
			}
			sc.close();
		}catch(Exception e) {
			System.err.println("1 or 2");
			System.exit(0);
		}
		
		System.out.println();
		System.out.println(	TriangleFactory.ChooseTriangle(option));
	}

}
