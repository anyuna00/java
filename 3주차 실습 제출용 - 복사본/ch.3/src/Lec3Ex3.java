
public class Lec3Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	for(int j =2; j<=1000; j++) {
		int i;
		for(i = 2; i < j; i++) {
			if(j % i==0) {
				break;
			}
		}	
			if (j==i)
				System.out.print(i+" ");
		}
	}
}


