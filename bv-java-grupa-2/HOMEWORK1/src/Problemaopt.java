
//8.	Input 3 numbers, and display the biggest.

import java.util.Scanner;

public class Problemaopt {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduceti primul numar: ");
		int a = s.nextInt();
		System.out.print("Introduceti cel de-al doilea numar: ");
		int b = s.nextInt();
		System.out.print("Introduceti cel de-al treilea numar: ");
		int c = s.nextInt();
		int maxim = a;
		if (b>maxim){
			maxim = b; 
		};
		if (c>maxim) {
				maxim = c;
		};
		System.out.println("Maximul este:   "+maxim);
	};
}
