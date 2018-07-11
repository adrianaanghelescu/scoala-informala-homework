
// 5.	Display all the prime numbers lower than a given number

import java.util.Scanner;

public class Problemacinci {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduceti numarul n: ");
		int n = s.nextInt();

		if (n != 0) {
			int p = 1;
			for (p=1;p<=n;p++) {
				int i = 2; 
				boolean prim = true;
				for (i=2;i<p;i++) {
					if (p%i==0) {
						prim = false;
						break;
					};
				};
				if (prim==true) {
					System.out.print(p+"  ");
				};
			};
		}
		else {
			System.out.println("Numarul introdus este 0!");	 
		};
	};
}


