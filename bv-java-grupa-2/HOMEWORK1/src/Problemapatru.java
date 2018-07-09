
//4.	Check if a number is palindrom( e.g palindrom 1221, 34143)

import java.util.Scanner;
public class Problemapatru {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Introduceti numarul n: ");
	int n = s.nextInt();
	int Aux = n, Pedos = 0;
	while (n != 0) {
		Pedos = Pedos * 10 + n % 10;
		n = n / 10;
	}
	if ( Aux==Pedos) {
		System.out.println("Numarul introdus este PALINDROM!");
	}	
	  else {
		System.out.println("Numarul introdus NU este PALINDROM!");
	  }	
		
	}
}


