package P1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter number of Passengers : ");
		int num = sc.nextInt();
		System.out.println("Enter the number of Kms: ");
		int km = sc.nextInt();
		 
		Ola myola = new Ola();
		Car myCar = myola.BookCar(num, km);
		
		int res = myola.calculateBill(myCar);
		
		System.out.println("The total fare amount is "+ res);
		
	}
}
