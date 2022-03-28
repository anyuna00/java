import java.util.Scanner;

public class Lec2Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  //3주차 과제 순차탐색
		int[] s = new int[] {0, 11, 18, 29, 35, 49, 62, 68, 73, 88, 100};
		
		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하시오: " );
        number = input.nextInt();
        for(int i =0; i<s.length; i++) {
        	if(number == s[i]) {
        		 System.out.print(s[i]+ "은 " + s[i-1] + "보다 크고 " + s[i+1] + "보다 작습니다.");
        		 break;
        	} 

	}
	}	
}
