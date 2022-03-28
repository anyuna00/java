
public class Car {
	
	String color;  
	int gear;	
	int speed;	
	void print() {
		System.out.println("색상은 " + color + "이고 기어는 " + gear + "이고 속도는 " + speed + "입니다.");

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
