import java.util.Scanner;

public class Www {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "www";
		int a;
		Scanner input = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ���> " );
		a = input.nextInt();
		String b = Integer.toString(a); 
		
		if("a".equals(word)) {
			 System.out.println("www�� �����մϴ�.");
			}else System.out.println("www�� �������� �ʽ��ϴ�.");
		
		if(b == "quit") {
			System.out.println("���� ����");	
		}


	}
}


