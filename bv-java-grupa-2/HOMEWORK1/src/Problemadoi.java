
// 2.	Display the smallest number from a collections of number

import java.util.Scanner;

public class Problemadoi {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Cate elemente are colectia de numere? ");
		int n = s.nextInt();
		int i;
		string[] a=new string[n];
		for(i = 0;i<n;i++) {
			String token = scan.next();
			a[i] = Integer.parseInt(token);
		}
			
		int min = a[0];
		for(i=1;i<n;i++) {
			if (min > a[i]) {
				min = a[i];
			};
		};
	};
}