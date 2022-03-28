import java.util.Scanner;

public class Www {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "www";
		int a;
		Scanner input = new Scanner(System.in);
		System.out.print("문자열을 입력하세요> " );
		a = input.nextInt();
		String b = Integer.toString(a); 
		
		if("a".equals(word)) {
			 System.out.println("www로 시작합니다.");
			}else System.out.println("www로 시작하지 않습니다.");
		
		if(b == "quit") {
			System.out.println("실행 종료");	
		}


	}
}


