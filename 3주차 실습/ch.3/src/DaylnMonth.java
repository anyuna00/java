import java.util.*;
public class DaylnMonth {

	public static void main(String[] args) {
		int month;
		int days = 0;
		
		System.out.print("�ϼ��� �˰� ���� ���� �Է��Ͻÿ�.");
		Scanner scan = new Scanner(System.in);
		
		month = scan.nextInt();
		switch(month) {
		case 2:
			days = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		
		default:
			days = 31;
			break;
		}
		System.out.println(month+"���� �ϼ���" + days);

	}

}
