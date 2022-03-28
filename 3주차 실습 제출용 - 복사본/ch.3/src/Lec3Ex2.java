import java.util.Scanner;
public class Lec3Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("양의 정수를 입력하시오: " );
		number = input.nextInt();
		for(i=1; i<=number; i++) {
			if((number%i)==0) {
				System.out.print( i+" ");
			}
		}
	}
}