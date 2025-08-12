package day1.basics;

public class BMW { // parent or super class
	void show() {
		System.out.println("Hii");
	}
	
	BMW (int a, int b){
		
	}
	class Ferrari extends BMW{	 // child or subclass
	}

	public static void main(String[] args) {
		BMW obj = new BMW();
		obj.show();
	}

}

 