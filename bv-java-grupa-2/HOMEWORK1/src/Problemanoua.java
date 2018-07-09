
// 9. Input 2 values:  start  and  finish, then display the numbers from start to finish

import java.util.Scanner;

public class Problemanoua {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduceti primul numar: ");
		int a = s.nextInt();
		System.out.print("Introduceti cel de-al doilea numar: ");
		int b = s.nextInt();
		if (a > b){
			 int Aux = a;
			 a = b;
			 b = Aux;
		}
		int i = a;
		for (i=a;i<=b;i++){
			System.out.print(i+"   ");
		};
	};
}
