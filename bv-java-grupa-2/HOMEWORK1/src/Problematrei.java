
// 3.	Display the max digit from a number. Read the number from keyboard.

import java.util.Scanner;

public class Problematrei {
    public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Introduceti numarul n: ");
		int n = s.nextInt();
		int Maxim = 0, Digit;
		while (n != 0) {
			Digit = n%10;
			if (Digit > Maxim){
				Maxim = Digit;
			}
		n =(n-Digit)/10;
		}
	System.out.println("Cifra maxima din numarul dat este:"+Maxim);
	}
}