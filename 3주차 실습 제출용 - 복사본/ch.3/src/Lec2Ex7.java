import java.util.Scanner;

public class Lec2Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  //3���� ���� ����Ž��
		int[] s = new int[] {0, 11, 18, 29, 35, 49, 62, 68, 73, 88, 100};
		
		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: " );
        number = input.nextInt();
        for(int i =0; i<s.length; i++) {
        	if(number == s[i]) {
        		 System.out.print(s[i]+ "�� " + s[i-1] + "���� ũ�� " + s[i+1] + "���� �۽��ϴ�.");
        		 break;
        	} 

	}
	}	
}
