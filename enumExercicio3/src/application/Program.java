package application;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Client;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //instancia para receber a data no formato DD/MM/YYYY
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Email:");
		String email = sc.next();
		System.out.print("Birth Date:");
		
		Client client = new Client(name, email, null);
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.next();
		System.out.print("How many items to this order? ");
		sc.close();
	}
}
