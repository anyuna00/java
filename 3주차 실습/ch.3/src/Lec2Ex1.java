import java.util.Scanner;
public class Lec2Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number1;
		int number2;
		Scanner input = new Scanner(System.in);
		System.out.print("ù ��° ������ �Է��Ͻÿ�: " );
        number1 = input.nextInt();
        System.out.print("�� ��° ������ �Է��Ͻÿ�: " );
        number2 = input.nextInt();
        
    if(number1 < number2 ) {
    	System.out.println("�� ��° ������ �� Ů�ϴ�.");
    } else {
    	System.out.println("ù ��° ������ �� Ů�ϴ�.");   
   }
}
	
}
