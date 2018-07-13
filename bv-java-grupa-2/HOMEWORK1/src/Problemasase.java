
// 6.	Input the dimensions of a rectangle and display area and perimeter.

import java.util.Scanner;

public class Problemasase {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Lungimea dreptunghiului este:  ");
		int lung = s.nextInt();
		System.out.print("Latimea dreptunghiului este:  ");
		int lat = s.nextInt();
		int area, perim;
		if ((lung <= 0)||(lat <= 0)) {
			System.out.println("Ati introdus o latura egala cu zero sau negativa => nu avem de a face cu un dreptunghi in acest caz");
		}
		else {		
			area = lung * lat;
			perim = 2 * (lung + lat);
			System.out.println("Aria dreptunghiului este:  "+area);
			System.out.println("Perimetru dreptunghiului este:   "+perim);
		}
	};
}
