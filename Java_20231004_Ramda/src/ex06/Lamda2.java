package ex06;

interface Printable2{
	void print(String msg);
}


public class Lamda2 {

	public static void main(String[] args) {
		Printable2 prn = new Printable2(){
			@Override
			public void print(String msg) {
				System.out.println(msg);
			}
		};
			
		
		
		prn.print("msg print2");

	}

}
