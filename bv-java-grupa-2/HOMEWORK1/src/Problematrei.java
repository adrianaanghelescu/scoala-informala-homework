
// 3.	Display the max digit from a number. Read the number from keyboard.

import java.util.Scanner;

public class Problematrei {
    public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Introduceti numarul n: ");
		int n = s.nextInt();
		int maxim = 0, digit;
		while (n != 0) {
			digit = n%10;
			if (digit > maxim){
				maxim = digit;
			}
		n =(n-digit)/10;
		}
	System.out.println("Cifra maxima din numarul dat este:"+maxim);
	}
}