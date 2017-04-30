package bike.test;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle R1 = new Rectangle(5, 5);
		
		Rectangle R2;
		R2 = R1.newInstance();
		R2.setHieght(20);
		R2.setWidth(20);
		R2.caluctor();
		R1.setHieght(20);
		System.out.print("/////////////////");
		R1.setWidth(50);
		System.out.print("/////////////////");
		System.out.print(R1.sum(150, 150));
		System.out.print("/////////////////");
		R1.Area(1, 1); 
		R1.caluctor();
		
	}

}
