
public class Car {
	
	String color;  
	int gear;	
	int speed;	
	void print() {
		System.out.println("������ " + color + "�̰� ���� " + gear + "�̰� �ӵ��� " + speed + "�Դϴ�.");

	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car a = new Car();
		
     	a.color = "red";  
		a.gear = 10;	
		a.speed = 80;
		a.print();

	}

}
