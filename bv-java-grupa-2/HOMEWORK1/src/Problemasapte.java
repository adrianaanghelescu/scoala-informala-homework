
//7.	Input the length of the side of a square, and display its area.  Produce an error message if the length is negative.

import java.util.Scanner;

public class Problemasapte {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduceti lungimea laturii patratului: ");
		int latura = s.nextInt();
		if (latura > 0) {
			System.out.println("Aria patratului este:   "+latura*latura);
		}
		else {
			System.out.println("Ati introdus latura egala cu zero sau negativa => nu avem de a face cu un patrat!");
		};
	};
}

