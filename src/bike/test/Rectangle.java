package bike.test;

public class Rectangle {
	public int width;
	public int hieght;

	public Rectangle(int width, int hieght) {
		this.width = width;
		this.hieght = hieght;

	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHieght() {
		return hieght;
	}

	public void setHieght(int hieght) {
		this.hieght = hieght;
	}

	public int sum(int a, int b) {
		int c;
		c = a + b;
		return c;
	}
	public int Area(int hieth,int width){
		int result;
		result=hieth*width;
		if(result<=0){
			System.out.println("The Rectangle less then Zero"+result);
		}
		else if(result>0){
			System.out.print("The Rectagle Big"+result);
		}
		return result;
	}

	public void caluctor() {
		System.out.print(hieght + " " + width);
	}
	
	public Rectangle newInstance(){
		return new Rectangle(1, 2);
	}
}
